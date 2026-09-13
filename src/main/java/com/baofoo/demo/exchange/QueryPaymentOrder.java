package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP汇款结果查询
 * @author mucang
 *
 */
public class QueryPaymentOrder {
	public static void main(String[] args) throws Exception {
		String url = "/api/payment/queryPaymentOrder";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", "20240715152156-9156605185");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountName":"GEP Testing Co., Ltd","applyDate":"2024-07-15 15:22:02","cardNo":"168888888","costBorne":"BEN","orderId":2407151522000031241,"payeeAmount":100.00,"payeeCcy":"USD","paymentAmount":100.00,"paymentCcy":"USD","paymentFeeAmount":11.00,"paymentFeeCcy":"USD","paymentFeeRate":100.000000,"paymentPurpose":1,"paymentReference":"Payment for goods","status":1,"tradeRate":100.000000,"userNo":5181240322000274308,"userReqNo":"20240715152156-9156605185"}

		//TODO  业务逻辑自行处理
	}
}
