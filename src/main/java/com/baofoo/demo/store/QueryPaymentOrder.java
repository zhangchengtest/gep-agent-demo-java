package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.13 电商平台付款结果查询
 * @author mucang
 *
 */
public class QueryPaymentOrder {
	public static void main(String[] args) {
		String url = "/api/payment/query-payment-order";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", "20240715173912-1177695807");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountName":"test account","applyDate":"2024-07-11 10:00:41","cardNo":"168888888","costBorne":"OUR","orderId":2407111000000030294,"payeeAmount":653.74,"payeeCcy":"CNH","paymentAmount":100.00,"paymentCcy":"USD","paymentFeeAmount":10.00,"paymentFeeCcy":"USD","paymentFeeRate":100.000000,"paymentPurpose":1,"paymentReference":"payment","status":1,"tradeRate":726.380000,"userNo":5181200731000138828,"userReqNo":"202407111000403090065724"}

		//TODO  业务逻辑自行处理
	}
}
