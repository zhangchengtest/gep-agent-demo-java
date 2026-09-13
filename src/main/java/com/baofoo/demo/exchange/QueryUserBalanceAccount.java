package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP商户账户余额查询接口
 * @author mucang
 *
 */
public class QueryUserBalanceAccount {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/account/queryUserBalanceAccount";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("ccy", "USD");// 币种
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
