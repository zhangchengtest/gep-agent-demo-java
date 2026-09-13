package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.22 电商平台境内代付结果查询
 * @author mucang
 *
 */
public class QueryTransferOrder {
	public static void main(String[] args) {
		String url = "/api/transfer/query-transfer-order";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("userReqNo", "20240711104542-5639501498");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"bankBranchName":"","bankCity":"","bankName":"工商银行","bankProvince":"","deductionFeeCcy":"USD","payeeAccNo":"6222023887605974217","payeeIdNo":"420101197508144817","payeeName":"张宝","transferAmt":100.01,"transferBatchId":"2407111045000030305","transferRemarks":"","transferState":2,"userReqNo":"20240711104542-5639501498"}

		//TODO  业务逻辑自行处理
	}
}
