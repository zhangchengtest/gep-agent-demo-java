package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.32 B2B结汇垫资开通申请
 * @author mucang
 *
 */
public class SettleAdvanceProductApplyOpen {
	public static void main(String[] args) {
		String url = "/api/agent/settle/settle-advance-product-apply-open";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/notify");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"result":true}
		//TODO  业务逻辑自行处理
	}
}
