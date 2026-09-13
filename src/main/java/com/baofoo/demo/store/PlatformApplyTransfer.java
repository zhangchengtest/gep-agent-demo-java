package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.22 电商平台境内代付申请
 * @author mucang
 *
 */
public class PlatformApplyTransfer {
	public static void main(String[] args) {
		String url = "/api/transfer/platform-apply-transfer";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("payeeName", "张宝");
		dataContentMap.put("payeeAccNo", "6222023887605974217");
		dataContentMap.put("payeeType", "2");
		dataContentMap.put("payeeIdNo", "420101197508144817");
		dataContentMap.put("bankProvince", "");
		dataContentMap.put("bankCity", "");
		dataContentMap.put("bankName", "工商银行");
		dataContentMap.put("bankBranchName", "");
		dataContentMap.put("transferAmt", "100.01");
		dataContentMap.put("transferRemarks", "");
		dataContentMap.put("callBackUrl", "");
		dataContentMap.put("deductionFeeCcy", "USD");
		dataContentMap.put("remarks", "");
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"bankBranchName":"","bankCity":"","bankName":"工商银行","bankProvince":"","deductionFeeCcy":"USD","payeeAccNo":"6222023887605974217","payeeIdNo":"420101197508144817","payeeName":"张宝","payeeType":2,"transferAmt":100.01,"transferRemarks":"","transferState":1,"userReqNo":"20240711104542-5639501498"}

		//TODO  业务逻辑自行处理
	}
}
