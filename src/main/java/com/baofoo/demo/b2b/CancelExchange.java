package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.28 汇兑锁定取消
 * @author mucang
 *
 */
public class CancelExchange {
	public static void main(String[] args) {
		String url = "/api/agent/exchange/cancel-exchange";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("userReqNo", "202407151155253117693615");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
