package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP充值子账户开户
 * @author mucang
 *
 */
public class ApplyGepRechargeSubAcc {
	public static void main(String[] args) throws Exception {
		String url = "/api/subAcc/apply-gep-recharge-sub-acc";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("accountPayeeType", "1");
		dataContentMap.put("country", "HKG");
		dataContentMap.put("callBackUrl", "http://mp-uat-wtp.verifin.global/mp-server/api/mp/callback/notify");
		dataContentMap.put("accountName", "GEP Testing Co., Ltd");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
	}
}
