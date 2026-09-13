package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.43 B2B汇款结果查询
 * @author mucang
 *
 */
public class QueryPaymentOrder {
	public static void main(String[] args) {
		String url = "/api/payment/queryPaymentOrder";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", "202407151401249405982410");

		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountName":"GEP Testing Co., Ltd","applyDate":"2024-07-15 14:01:26","cardNo":"1688888881","costBorne":"OUR","orderId":2407151401000031236,"payeeAmount":100.00,"payeeCcy":"USD","paymentAmount":100.00,"paymentCcy":"USD","paymentFeeAmount":55.00,"paymentFeeCcy":"USD","paymentFeeRate":100.000000,"paymentPurpose":1,"paymentReference":"Payment for goods","status":1,"tradeRate":100.000000,"userNo":5181240322000274308,"userReqNo":"202407151401249405982410"}

		//TODO  业务逻辑自行处理
	}
}
