package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.26 汇兑锁定申请
 * @author mucang
 *
 */
public class ApplyExchange {
	public static void main(String[] args) {
		String url = "/api/agent/exchange/apply-exchange";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("closingDate", "2024-07-15");
		dataContentMap.put("closingType", "TOD");
		dataContentMap.put("direction", 1);
		dataContentMap.put("tradeModel", 1);		
		dataContentMap.put("buyCcy", "CNH");
		dataContentMap.put("sellCcy", "USD");

		if((int)dataContentMap.get("direction") == 1) {
			dataContentMap.put("buyAmount", "100");
		}else if ((int)dataContentMap.get("direction") == 2) {
			dataContentMap.put("sellAmount", "100");
		}
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"buyAmount":100,"buyCcy":"CNH","closingDate":"2024-07-15","closingStatus":0,"direction":1,"exchangeId":2407151152000031222,"orderState":0,"sellAmount":13.79,"sellCcy":"USD","tradeRate":7.249099,"userNo":5181240322000274308,"userReqNo":"202407151152236362178234"}

		//TODO  业务逻辑自行处理
	}
}
