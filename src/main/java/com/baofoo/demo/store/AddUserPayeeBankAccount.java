package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.30 GEP 用户收款银行帐号信息新增
 * @author mucang
 *
 */
public class AddUserPayeeBankAccount {
	public static void main(String[] args) {
		String url = "/api/user/payee-account/add-user-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("accType", "1");
		dataContentMap.put("accountCcy", "USD");
		dataContentMap.put("accountName", "MEBER TEST");
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
		//result解密信息：{"accType":1,"accountCcy":"USD","accountName":"MEBER TEST","bankAddress":"89, Lebuh Medini Utara, 79725 Nusajaya, Johor, Malaysia","bankBranchName":"","bankName":"TMBThanachart Bank Public Company Limited (TTB)","cardNo":"1688888888","countryCode":"CHN","payeeAddress":"89, Lebuh Medini Utara, 79725 Nusajaya, Johor, Malaysia","recordNo":"2407151650000002623","swiftCode":""}

		//TODO  业务逻辑自行处理
	}
}
