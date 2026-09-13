package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 结汇订单明细查询
 * @author mucang
 *
 */
public class QueryDeclarationOrder {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/declarationOrder/queryDeclarationOrder";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("status", "");
		dataContentMap.put("fileBatchNo", "2404231354000077098");
		dataContentMap.put("fileType", "2");
		dataContentMap.put("currentPage", "1");
		dataContentMap.put("pageSize", "20");
		dataContentMap.put("beginTime", "2024-04-23");
		dataContentMap.put("endTime", "2024-04-24");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"currentPage":1,"list":[{"availableOrderAmt":0,"createAtStr":"2024-04-23 13:54:57","fileBatchNo":"2404231354000077098","orderAmt":0.010,"orderCcy":"USD","orderId":"2404231354000077100","relationOrderAmt":0,"state":1,"tradeAt":"2024-04-01 00:00:00","userNo":"5181240322000274308","userTransId":"202404011703002"},{"availableOrderAmt":0,"createAtStr":"2024-04-23 13:54:57","fileBatchNo":"2404231354000077098","orderAmt":100.000,"orderCcy":"USD","orderId":"2404231354000077099","relationOrderAmt":0,"state":1,"tradeAt":"2024-04-01 00:00:00","userNo":"5181240322000274308","userTransId":"202404011703001"}],"pageSize":20,"totalCount":2}

		//TODO  业务逻辑自行处理
	}
}
