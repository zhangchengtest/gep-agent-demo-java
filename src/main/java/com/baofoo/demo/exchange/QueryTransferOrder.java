package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP境内代付结果查询
 * @author mucang
 *
 */
public class QueryTransferOrder {
	public static void main(String[] args) throws Exception {
		String url = "/api/transfer/query-transfer-order";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userReqNo", "20240409153928SN5097058195");
		dataContentMap.put("userNo", GepUtils.userNo);
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
