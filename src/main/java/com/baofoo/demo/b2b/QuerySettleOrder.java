package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 结汇付款订单查询
 * @author mucang
 *
 */
public class QuerySettleOrder {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/settle/querySettleOrder";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("currentPage", 1);
		dataContentMap.put("pageSize", 20);
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"currentPage":1,"list":[{"accountName":"张宝","applyDate":"2024-07-15 11:36:56","auditStatus":"1","businessNo":"2404231535000016174","cardNo":"6222021030839227090","orderId":"2407151136000031218","payeeAmountAndCcy":"CNY 7.24","paymentAmountAndCcy":"USD 1.00","status":"待处理","statusKey":1,"tradeRate":7.247800},{"accountName":"张宝","applyDate":"2024-04-23 18:13:22","auditStatus":"2","businessNo":"2404231535000016174","cardNo":"6222021030839227090","orderId":"2404231813000077160","payeeAmountAndCcy":"CNY 79.71","paymentAmountAndCcy":"USD 11.00","status":"处理中","statusKey":2,"tradeRate":7.246550},{"accountName":"张宝","applyDate":"2024-04-23 18:06:22","auditStatus":"2","businessNo":"2404231535000016174","cardNo":"6222021030839227090","orderId":"2404231806000077152","payeeAmountAndCcy":"CNY 7.24","paymentAmountAndCcy":"USD 1.00","status":"处理中","statusKey":2,"tradeRate":7.246550},{"accountName":"张宝","applyDate":"2024-04-23 16:55:43","auditStatus":"2","businessNo":"2404231535000016174","cardNo":"6222021030839227090","orderId":"2404231655000077139","payeeAmountAndCcy":"CNY 724.36","paymentAmountAndCcy":"USD 100.00","status":"处理中","statusKey":2,"tradeRate":7.246500}],"pageSize":20,"totalCount":4}


		//TODO  业务逻辑自行处理
	}
}
