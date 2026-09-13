package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.47 未发货结汇材料订单查询接口
 * @author mucang
 *
 */
public class QueryCompletionOrderLogisticsData {
	public static void main(String[] args) {
		String url = "/api/agent/declarationOrder/queryCompletionOrderLogisticsData";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("beginTime", "2024-07-01");
		dataContentMap.put("endTime", "2024-07-15");
		dataContentMap.put("currentPage", "1");
		dataContentMap.put("pageSize", "20");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"currentPage":1,"list":[],"pageSize":20,"totalCount":0}

		//TODO  业务逻辑自行处理
	}
}
