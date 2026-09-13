package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.45 GEP汇率查询
 * @author mucang
 *
 */
public class QueryRate {
	public static void main(String[] args) {
		String url = "/api/agent/rate/query-rate";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("originalCcy", "CNH");
		dataContentMap.put("targetCcy", "USD");
		dataContentMap.put("bizType", "6");
		dataContentMap.put("closingType", "TOD");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"closingDate":"2024-07-15","closingType":"TOD","exchangeRate":8.278100,"originalCcy":"USD","targetCcy":"CNH","userNo":5181240322000274308}

		//TODO  业务逻辑自行处理
	}
}
