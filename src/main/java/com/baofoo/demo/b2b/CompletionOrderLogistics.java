package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.48 未发货(物流补全信息审核失败)结汇订单补充材料接口
 * @author mucang
 *
 */
public class CompletionOrderLogistics {
	public static void main(String[] args) {
		String url = "/api/agent/declarationOrder/completionOrderLogistics";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("fileBatchNo", "2103021732000068578");
		dataContentMap.put("voucherFileId", 13331433);
		dataContentMap.put("deliveryDate", "2024-07-01");
		dataContentMap.put("logisticsCompanyName", "debangwuliu");
		dataContentMap.put("logisticsNumber", "123456");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/notify");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
