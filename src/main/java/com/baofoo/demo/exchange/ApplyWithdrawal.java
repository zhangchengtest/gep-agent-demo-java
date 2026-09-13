package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP提现申请
 * @author mucang
 *
 */
public class ApplyWithdrawal {
	public static void main(String[] args) throws Exception {
		String url = "/api/withdrawal/apply-withdrawal";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("fixedModel", "1");//固定模式：1-固定付款金额，2-固定收款金额
		dataContentMap.put("paymentCcy", "USD");
		dataContentMap.put("payeeCcy", "CNH");
		if(dataContentMap.get("fixedModel").equals("1")) {//固定模式：1-固定付款金额
			dataContentMap.put("paymentAmount", "1001");
		}else if(dataContentMap.get("fixedModel").equals("2")) {//固定模式：2-固定收款金额
			dataContentMap.put("payeeAmount", "1001");
		}
		dataContentMap.put("paymentPurpose", "1");
		dataContentMap.put("paymentReference", "payment");
		dataContentMap.put("costBorne", "OUR");//费用承担方式：SHA-非全额到账、OUR-全额到账、BEN-收款人承担
		dataContentMap.put("cardNo", "1688888881");
		dataContentMap.put("accountName", "GEP Testing Co., Ltd");
		dataContentMap.put("paymentFeeCcy", "USD");
		dataContentMap.put("callBackUrl", "");
		dataContentMap.put("payerUserNo", "");

		GepUtils.sendRequest(url, dataContentMap, null, true);
	}
}
