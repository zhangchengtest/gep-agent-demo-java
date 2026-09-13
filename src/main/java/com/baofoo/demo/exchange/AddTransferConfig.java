package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 新增转账关系配置接口
 * 此接口只支持代理商发起
 * @author mucang
 *
 */
public class AddTransferConfig {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/productOpenApply/add-transfer-config";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("payeeUserNo", "5181240322000274308");
		dataContentMap.put("changeContent", "转账关系配置");
		dataContentMap.put("remarks", "");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/GEP_VAS/notify/ex");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
	}
}
