package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.11 电商平台可出款店铺列表查询
 * @author mucang
 *
 */
public class QueryPaymentStore {
	public static void main(String[] args) {
		String url = "/api/payment/query-payment-store";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("ccy", "USD");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：[{"availableAmt":0.010,"ccy":"USD","paymentFlag":"2","storeName":"1212121","storeNo":"2404121455000075720","storePlatform":"INDEPENDENT-USD"}]
		
		//TODO  业务逻辑自行处理
	}
}
