package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.31 用户余额查询
 * @author mucang
 *
 */
public class QueryUserBalanceAccount {
	public static void main(String[] args) {
		String url = "/api/agent/user/account/queryUserBalanceAccount";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("ccy", "USD");
		dataContentMap.put("accountType", "7");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
