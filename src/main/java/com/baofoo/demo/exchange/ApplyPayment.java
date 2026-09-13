package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP汇款申请
 * @author mucang
 *
 */
public class ApplyPayment {
	public static void main(String[] args) throws Exception {
		String url = "/api/payment/applyPayment";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("paymentMode", "SWIFT");// SWIFT、 LOCAL、 BILLPAY、 BPAY,为空则默认SWIFT
		dataContentMap.put("paymentCcy", "USD");
		dataContentMap.put("payeeCcy", "USD");
		dataContentMap.put("fixedModel", "1");//固定模式：1-固定付款金额，2-固定收款金额
		if("1".equals(dataContentMap.get("fixedModel"))) {//1-固定付款金额
			dataContentMap.put("paymentAmount", "100");
			dataContentMap.put("payeeAmount", "0");
		}else if ("2".equals(dataContentMap.get("fixedModel"))) {//2-固定收款金额
			dataContentMap.put("payeeAmount", "100");
			dataContentMap.put("paymentAmount", "0");
		}	
		dataContentMap.put("paymentPurpose", "1");
		dataContentMap.put("paymentReference", "Payment for goods");
		dataContentMap.put("costBorne", "BEN");//费用承担方式：SHA-非全额到账、OUR-全额到账、BEN-收款人承担
		dataContentMap.put("paymentMaterial", 13330095);
		dataContentMap.put("cardNo","168888888");
		dataContentMap.put("accountName","GEP Testing Co., Ltd");
		dataContentMap.put("businessNo","2407151516000002618");
		dataContentMap.put("paymentFeeCcy","USD");
		dataContentMap.put("callBackUrl","");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountName":"GEP Testing Co., Ltd","applyDate":"2024-07-15 15:22:02","cardNo":"168888888","costBorne":"BEN","orderId":2407151522000031241,"payeeAmount":100.00,"payeeCcy":"USD","paymentAmount":100.00,"paymentCcy":"USD","paymentFeeAmount":11.00,"paymentFeeCcy":"USD","paymentFeeRate":100.000000,"paymentPurpose":1,"paymentReference":"Payment for goods","status":1,"tradeRate":100.000000,"userNo":5181240322000274308,"userReqNo":"20240715152156-9156605185"}

	}
}
