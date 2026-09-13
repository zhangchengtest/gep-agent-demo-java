package com.baofoo.demo.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.8 电商平台提现申请
 * @author mucang
 *
 */
public class PlatformApplyWithdrawal {
	public static void main(String[] args) {
		String url = "/api/withdrawal/platform-apply-withdrawal";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("paymentCcy", "USD");
		dataContentMap.put("paymentAmount", "100");
		dataContentMap.put("payeeCcy", "USD");
		dataContentMap.put("paymentPurpose", "1");
		dataContentMap.put("paymentReference", "payment");
		dataContentMap.put("costBorne", "OUR");
		dataContentMap.put("cardNo", "1688888888");
		dataContentMap.put("accountName", "MEBER TEST");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/link1");
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> storeMap = new HashMap<>();
		storeMap.put("storeNo", "2404121455000075720");
		storeMap.put("paymentAmt", "100");
		list.add(storeMap);
		
		dataContentMap.put("paymentStoreList", list);
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		// result解密信息：{"accountName":"MEBER TEST","applyDate":"2024-07-15 16:53:09","cardNo":"1688888888","costBorne":"OUR","orderId":2407151653000031284,"payeeAmount":30.00,"payeeCcy":"USD","paymentAmount":100.00,"paymentCcy":"USD","paymentFeeAmount":70.00,"paymentFeeCcy":"USD","paymentFeeRate":100.000000,"paymentPurpose":10,"paymentReference":"payment","status":1,"tradeRate":100.000000,"userNo":5181240322000274308,"userReqNo":"202407151653080764146987"}

		//TODO  业务逻辑自行处理
	}
}
