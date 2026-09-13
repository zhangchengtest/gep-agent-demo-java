package com.baofoo.demo.b2b;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 结汇订单文件提交
 * @author mucang
 *
 */
public class SubmitOrder {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/declarationOrder/submitOrder";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		
		File orderFile = new File(System.getProperty("user.dir") + "/src/main/webapp/file/B2B上传明细模板.xls");
		dataContentMap.put("fileId", 13331433);
		dataContentMap.put("fileName", orderFile.getName());
		
		dataContentMap.put("voucherFileId", 13331435);
		dataContentMap.put("fileType", "2");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/GepDemoJava/notify/agent");
		dataContentMap.put("buyerName", "gep test");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"fileBatchNo":"2407151129000031217"}
		//TODO  业务逻辑自行处理
	}
}
