package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP汇兑锁定取消
 * @author mucang
 *
 */
public class CancelExchange {
	public static void main(String[] args) throws Exception {
		String url = "/api/exchange/cancel-exchange";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("userReqNo", "202407151527578737883781");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"buyAmount":12.07,"buyCcy":"USD","closingDate":"2024-07-15","closingStatus":3,"direction":2,"exchangeId":2407151527000031244,"orderState":2,"sellAmount":100.00,"sellCcy":"CNH","tradeRate":8.280699,"userNo":5181240322000274308,"userReqNo":"202407151527578737883781"}

	}
}
