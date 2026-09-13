package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.9 电商平台提现结果查询
 * @author mucang
 *
 */
public class QueryWithdrawalOrder {
	public static void main(String[] args) {
		String url = "/api/withdrawal/query-withdrawal-order";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", "202407151653080764146987");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountName":"MEBER TEST","applyDate":"2024-07-15 16:53:09","cardNo":"1688888888","costBorne":"OUR","orderId":2407151653000031284,"payeeAmount":30.00,"payeeCcy":"USD","paymentAmount":100.00,"paymentCcy":"USD","paymentFeeAmount":70.00,"paymentFeeCcy":"USD","paymentFeeRate":100.000000,"paymentPurpose":10,"paymentReference":"payment","status":1,"tradeRate":100.000000,"userNo":5181240322000274308,"userReqNo":"202407151653080764146987"}

		//TODO  业务逻辑自行处理
	}
}
