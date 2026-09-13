package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 账户转账查询接口
 * @author mucang
 *
 */
public class QueryTransferDetail {
	public static void main(String[] args) throws Exception {
		String url = "/api/account-transfer/query-transfer-detail";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("userReqNo", "20240409175626SN1592836553");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
