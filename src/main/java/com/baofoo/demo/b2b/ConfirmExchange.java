package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.27 汇兑锁定确认
 * @author mucang
 *
 */
public class ConfirmExchange {
	public static void main(String[] args) {
		String url = "/api/agent/exchange/confirm-exchange";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("userReqNo", "202407151155253117693615");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"buyAmount":100.00,"buyCcy":"CNH","closingDate":"2024-07-15","closingStatus":0,"direction":1,"exchangeId":2407151155000031223,"orderState":1,"sellAmount":13.79,"sellCcy":"USD","tradeRate":7.249099,"userNo":5181240322000274308,"userReqNo":"202407151155253117693615"}

		//TODO  业务逻辑自行处理
	}
}
