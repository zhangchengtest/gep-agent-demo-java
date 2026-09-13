package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP结汇结果查询
 * @author mucang
 * 20240409145756SN2217395639
 */
public class QuerySettleOrder {
	public static void main(String[] args) throws Exception {
		String url = "/api/settle/query-settle-order";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", "20240409145756SN2217395639");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
