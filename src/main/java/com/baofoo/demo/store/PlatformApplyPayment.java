package com.baofoo.demo.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.12 电商平台付款申请
 * @author mucang
 *
 */
public class PlatformApplyPayment {
	public static void main(String[] args) {
		String url = "/api/payment/platform-apply-payment";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("paymentCcy", "USD");
		dataContentMap.put("paymentAmount", "100");
		dataContentMap.put("payeeCcy", "CNH");
		dataContentMap.put("paymentPurpose", "1");
		dataContentMap.put("paymentReference", "payment");
		dataContentMap.put("costBorne", "OUR");
		
		dataContentMap.put("businessNo", "2407151656000002624");
		
		dataContentMap.put("cardNo", "168888888");
		dataContentMap.put("accountName", "test account");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/link2");
		dataContentMap.put("paymentMaterial", 13330430);
		dataContentMap.put("paymentMaterialName", "test.jsp");
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> storeMap = new HashMap<>();
		storeMap.put("storeNo", "2404121455000075720");
		storeMap.put("paymentAmt", "100");
		list.add(storeMap);
		
		
		dataContentMap.put("paymentStoreList", list);
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountName":"test account","applyDate":"2024-07-15 17:39:13","cardNo":"168888888","costBorne":"OUR","orderId":2407151739000031298,"payeeAmount":217.49,"payeeCcy":"CNH","paymentAmount":100.00,"paymentCcy":"USD","paymentFeeAmount":70.00,"paymentFeeCcy":"USD","paymentFeeRate":100.000000,"paymentPurpose":1,"paymentReference":"payment","status":1,"tradeRate":724.980000,"userNo":5181240322000274308,"userReqNo":"20240715173912-1177695807"}

		//TODO  业务逻辑自行处理
	}
}
