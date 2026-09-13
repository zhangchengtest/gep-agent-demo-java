package com.baofoo.demo.exchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP汇率查询
 * @author mucang
 *
 */
public class QueryRate {
	public static void main(String[] args) throws Exception {
		String url = "/api/rate/query-rate";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("originalCcy", "CNH");
		dataContentMap.put("targetCcy", "USD");
		dataContentMap.put("closingDate", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"closingDate":"2024-07-15","exchangeRate":6.250299,"originalCcy":"CNH","targetCcy":"USD","userNo":5181240322000274308}

		//TODO  业务逻辑自行处理
	}
}
