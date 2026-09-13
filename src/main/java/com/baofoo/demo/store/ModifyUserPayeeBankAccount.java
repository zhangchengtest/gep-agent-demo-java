package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.31 GEP 用户收款银行帐号信息更新
 * @author mucang
 *
 */
public class ModifyUserPayeeBankAccount {
	public static void main(String[] args) {
		String url = "/api/user/payee-account/modify-user-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("recordNo", "2407101457000002175");
		dataContentMap.put("accType", "1");
		dataContentMap.put("accountCcy", "CHN");
		dataContentMap.put("accountName", "MEBER TEST1");
		dataContentMap.put("cardNo", "1688888888");
		dataContentMap.put("bankName", "TMBThanachart Bank Public Company Limited (TTB)");
		dataContentMap.put("bankBranchName", "");
		dataContentMap.put("countryCode", "CHN");
		dataContentMap.put("swiftCode", "");
		dataContentMap.put("payeeAddress", "89, Lebuh Medini Utara, 79725 Nusajaya, Johor, Malaysia");
		dataContentMap.put("bankAddress", "89, Lebuh Medini Utara, 79725 Nusajaya, Johor, Malaysia");
		dataContentMap.put("clearingCode", "");
		dataContentMap.put("province", "上海");
		dataContentMap.put("city", "上海");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
