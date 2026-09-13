package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 账户转账申请接口
 * @author mucang
 *
 */
public class LaunchTransfer {
	public static void main(String[] args) throws Exception {
		String url = "/api/account-transfer/launch-transfer";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("payerAmt", "1001");
		dataContentMap.put("payerCcy", "USD");
		dataContentMap.put("payeeUserNo", "5181240322000274308");
		dataContentMap.put("payerReference", "");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/GEP_VAS/notify/ex");
				
		GepUtils.sendRequest(url, dataContentMap, null, true);
	}
}
