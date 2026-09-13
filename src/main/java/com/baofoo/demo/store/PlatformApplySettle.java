package com.baofoo.demo.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.15 电商平台结汇申请
 * @author mucang
 *
 */
public class PlatformApplySettle {
	public static void main(String[] args) {
		String url = "/api/settle/platform-apply-settle";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("paymentCcy", "USD");
		dataContentMap.put("paymentAmount", "100");
		dataContentMap.put("paymentPurpose", "1");
		dataContentMap.put("industryType", "01");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/link3");
		dataContentMap.put("paymentMaterial", 13330739);
		dataContentMap.put("paymentMaterialName", "GEP-结汇货物贸易明细XLSX模版.xlsx");
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> storeMap = new HashMap<>();
		storeMap.put("storeNo", "2404121455000075720");
		storeMap.put("paymentAmt", "100");
		//list.add(storeMap);
		
		Map<String, Object> storeMap1 = new HashMap<>();
		storeMap1.put("storeNo", "2404121455000075720");
		storeMap1.put("paymentAmt", "100");
		list.add(storeMap1);
		
		dataContentMap.put("paymentStoreList", list);
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"applyDate":"2024-07-15 17:41:38","costBorne":"OUR","orderId":2407151741000031301,"payeeAmount":724.98,"payeeCcy":"CNH","paymentAmount":100.00,"paymentCcy":"USD","paymentFeeAmount":0.00,"paymentFeeCcy":"USD","paymentFeeRate":100.000000,"paymentPurpose":1,"status":1,"tradeRate":724.980000,"userNo":5181240322000274308,"userReqNo":"20240715174129-7172488224"}

		//TODO  业务逻辑自行处理
	}
}
