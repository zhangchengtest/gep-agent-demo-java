package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP结汇申请
 * @author mucang
 *
 */
public class ApplySettle {
	public static void main(String[] args) throws Exception {
		String url = "/api/settle/apply-settle";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("paymentCcy", "USD");
		dataContentMap.put("paymentAmount", "200");
		dataContentMap.put("paymentPurpose", "1");
		dataContentMap.put("paymentFeeCcy", "USD");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/GEP_VAS/notify/ex");
		
		dataContentMap.put("paymentMaterial", 13330095);
		dataContentMap.put("paymentMaterialName", "GEP结汇.xlsx");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
	}
}
