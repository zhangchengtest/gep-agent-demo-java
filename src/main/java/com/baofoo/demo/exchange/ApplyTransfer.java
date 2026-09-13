package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP境内代付申请
 * @author mucang
 *
 */
public class ApplyTransfer {
	public static void main(String[] args) throws Exception {
		String url = "/api/transfer/apply-transfer";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("payeeName", "张宝");
		dataContentMap.put("payeeAccNo", "6222022526641212030");
		dataContentMap.put("payeeType", "2");
		dataContentMap.put("payeeIdNo", "21110219850623722X");
		dataContentMap.put("bankProvince", "上海");
		dataContentMap.put("bankCity", "上海");
		dataContentMap.put("bankName", "中国银行");
		dataContentMap.put("bankBranchName", "浦东");
		dataContentMap.put("transferAmt", "11.05");
		dataContentMap.put("transferRemarks", "");
		dataContentMap.put("deductionFeeCcy", "USD");
		dataContentMap.put("remarks", "");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
	}
}
