package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 结汇付款交易重新出款
 * @author mucang
 *
 */
public class AgainWithdrawOrder {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/settle/againWithdrawOrder";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("orderNo", "2407151136000031218");
		dataContentMap.put("accType", 1);
		dataContentMap.put("accountName", "宝付有限公司");
		dataContentMap.put("cardNo", "1688888");
		dataContentMap.put("bankName", "中国银行");
		dataContentMap.put("bankBranchName", "浦东分行");
		dataContentMap.put("province", "310000_上海");
		dataContentMap.put("city", "310100_上海");
		dataContentMap.put("bankAddress", "上海浦东");
		dataContentMap.put("payeeAddress", "北京大兴");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
