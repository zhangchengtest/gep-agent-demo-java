package com.baofoo.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.alibaba.fastjson.JSONObject;
import com.baofoo.rsa.RsaCodingUtil;

public class GepUtils {
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random RANDOM = new Random();
	
    public static final String doMain = "https://member-test-api.gepholding.com";
    public static final String dataType = "JSON";
    
    // 代理商测试信息
    public static final String agentNo = "5182210819000222768";//代理商编号
    public static final String certificateId = "2211211448000022579";//代理商编号
    public static final String pfxpath = System.getProperty("user.dir") + "/src/main/webapp/file/privatekey.pfx";
    public static final String cerpath = System.getProperty("user.dir") + "/src/main/webapp/file/publickey.cer";
    public static final String pfxpass = "5181221121000514358_416342";//商户私钥密钥
    
    public static final String userNo = "5181240322000274308";
    
    /**
     * 生成流水号
     * @return sn 流水号
     */
    public static String randomSn() {
        String timestamp = DATE_FORMAT.format(new Date());
        String randomNumeric = String.format("%010d", RANDOM.nextLong() % 1_000_000_0000L);
        return timestamp + randomNumeric;
    }
    
    public static void log(String msg) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + "\t: " + msg);
	}
	
    /**
     * 通用请求方法
     * @param url 请求路径
     * @param params dataContent参数
     * @param fileParams 文件信息，接口不上传文件时传null
     * @param hasDecryptResult 是否解密返回的result:true-需要解密|false-不解密
     * @return
     */
    public static String sendRequest(String url,Map<String, Object> params, Map<String, FileItem> fileParams, boolean hasDecryptResult) {
    	String dataContentJson = JSONObject.toJSONString(params);
    	log("dataContentJson:"+dataContentJson);

		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("version", "1.0.0");
		requestMap.put("certificateId", certificateId);
		requestMap.put("agentNo", agentNo);
		requestMap.put("userNo", userNo);
		requestMap.put("dataType", "JSON");
		requestMap.put("apiType", "1");
		try {
			String dataContent = RsaCodingUtil.encryptByPriPfxFile(SecurityUtil.Base64Encode(dataContentJson), pfxpath, pfxpass);
			requestMap.put("dataContent", dataContent);
			
			Map<String, String> headers = new HashMap<String, String>();
			// return en-code
			// headers.put("Accept-Language", "en-US");
			log("requestMap:"+requestMap);
			String response = HttpUtil.doPost(doMain + url, requestMap, fileParams, headers);
			log("response:"+response);
			// result不需要解密时直接返回
			if (!hasDecryptResult) {
				return response;
			}

			JSONObject responseJson = JSONObject.parseObject(response);
			if(responseJson.getBooleanValue("success")) {
				
				//解密：先rsa公钥解密，再base64解码
				String result = SecurityUtil.Base64Decode(RsaCodingUtil.decryptByPubCerFile(responseJson.getString("result"), cerpath));
				log("result解密信息："+result);
				return result;
			}else {
				log("errorCode："+responseJson.getString("errorCode")+"|errorMsg:"+responseJson.getString("errorMsg"));
			}
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return "";
    }	
}
