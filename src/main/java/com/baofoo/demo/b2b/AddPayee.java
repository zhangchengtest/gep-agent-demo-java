package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 新增结汇收款人
 * @author mucang
 *
 */
public class AddPayee {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/payee/addPayee";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("partnerType", 2);
		if((int)dataContentMap.get("partnerType") == 2) {
			dataContentMap.put("nameType", "1");
			dataContentMap.put("name", "全球有限互联公司");
			dataContentMap.put("bankName", "工商银行");
			dataContentMap.put("cardNo", "1688888");
			dataContentMap.put("bankBranchName", "张江支行");
			dataContentMap.put("bankProvince", "310000_上海市");
			dataContentMap.put("bankCity", "310115_浦东新区");
			dataContentMap.put("bankAddress", "浦东");
			
		}else if ((int)dataContentMap.get("partnerType") == 5) {
			dataContentMap.put("name", "张宝");
			dataContentMap.put("legalIdNo", "360727199408019102");
			dataContentMap.put("bankName", "工商银行");
			dataContentMap.put("cardNo", "6222021030839227090");
			dataContentMap.put("bankBranchName", "张江支行");
			dataContentMap.put("bankProvince", "310000_上海市");
			dataContentMap.put("bankCity", "310115_浦东新区");
			dataContentMap.put("bankAddress", "浦东");
			dataContentMap.put("accountDocument", 13331433);
		}else if ((int)dataContentMap.get("partnerType") == 6) {
			//TODO
		}
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/GepDemoJava/notify/agent");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"partnerNo":2407151124000033545}
		//TODO  业务逻辑自行处理
	}
}
