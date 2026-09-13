package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 结汇订单文件批次查询
 * @author mucang
 *
 */
public class QueryDeclarationBatchInfo {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/declarationOrder/queryDeclarationBatchInfo";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("status", "");

		dataContentMap.put("fileType", "2");
		dataContentMap.put("currentPage", "1");
		dataContentMap.put("pageSize", "20");
		dataContentMap.put("beginTime", "2024-04-23");
		dataContentMap.put("endTime", "2024-04-24");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"currentPage":1,"list":[{"availableAmt":0.01,"createAt":"2024-04-23 18:01:53","fileBatchNo":"2404231801000077146","fileName":"B2B上传明细模板.xls","orderCcy":"USD","orderOriginalAmt":10000.010,"status":2},{"availableAmt":0.00,"createAt":"2024-04-23 14:49:50","fileBatchNo":"2404231449000077106","fileName":"B2B上传明细模板.xls","orderCcy":"USD","orderOriginalAmt":100.010,"status":3},{"availableAmt":0.00,"createAt":"2024-04-23 13:54:56","fileBatchNo":"2404231354000077098","fileName":"B2B上传明细模板.xls","orderCcy":"USD","orderOriginalAmt":100.010,"status":2}],"pageSize":20,"totalCount":3}

		//TODO  业务逻辑自行处理
	}
}
