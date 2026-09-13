package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP汇兑锁定确认
 * @author mucang
 *
 */
public class ConfirmExchange {
	public static void main(String[] args) throws Exception {
		String url = "/api/exchange/confirm-exchange";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("userReqNo", "202407151527578737883781");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
	}
}
