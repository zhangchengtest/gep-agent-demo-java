package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 入账交易关联申报订单
 * @author mucang
 *
 */
public class PayeeTradeRelatedOrder {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/declarationOrder/payeeTradeRelatedOrder";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("detailId", "2404231057000077085");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/GepDemoJava/notify/agent");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("orderId", "2404231354000077099");
		map.put("relationOrderAmt", "100");
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("orderId", "2404231354000077100");
		map1.put("relationOrderAmt", "0.01");
		
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		list.add(map);
		list.add(map1);
		
		dataContentMap.put("relationSettleOrderDetailList", list);
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
