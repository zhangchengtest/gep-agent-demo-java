package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP充值子账户查询
 * @author mucang
 *
 */
public class QuerySubAcc {
	public static void main(String[] args) throws Exception {
		String url = "/api/subAcc/query-sub-acc";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		//dataContentMap.put("userReqNo", "");
		dataContentMap.put("applyId", "2609141644000068161");
		dataContentMap.put("country", "HKG");
		dataContentMap.put("accountPayeeType", "1");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
