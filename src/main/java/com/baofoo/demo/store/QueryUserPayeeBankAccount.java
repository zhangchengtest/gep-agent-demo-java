package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.32 GEP 用户收款银行帐号信息查询
 * @author mucang
 *
 */
public class QueryUserPayeeBankAccount {
	public static void main(String[] args) {
		String url = "/api/user/payee-account/query-user-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("recordNo", "2407151650000002623");
		dataContentMap.put("accountCcy", "");
		dataContentMap.put("accountName", "");
		dataContentMap.put("cardNo", "");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accType":1,"accountCcy":"CHN","accountName":"MEBER TEST1","bankAddress":"89, Lebuh Medini Utara, 79725 Nusajaya, Johor, Malaysia","bankBranchName":"","bankName":"TMBThanachart Bank Public Company Limited (TTB)","cardNo":"1688888888","clearingCode":"","countryCode":"CHN","middleBankCountry":"","middleBankName":"","middleSwiftCode":"","payeeAddress":"89, Lebuh Medini Utara, 79725 Nusajaya, Johor, Malaysia","recordNo":"2407101457000002175","swiftCode":"","userNo":"5181200731000138828"}

		//TODO  业务逻辑自行处理
	}
}
