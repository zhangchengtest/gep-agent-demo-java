package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP 常用收款人收款银行帐号信息查询
 * @author mucang
 *
 */
public class QueryUserPartnerPayeeBankAccount {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/payee-account/query-user-partner-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("recordNo", "");
		dataContentMap.put("businessNo", "2407151336000002604");
		dataContentMap.put("accountCcy", "USD");
		dataContentMap.put("accountName", "GEP Testing Co., Ltd");
		dataContentMap.put("cardNo", "1688888881");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accType":1,"accountCcy":"USD","accountName":"GEP Testing Co., Ltd","bankAddress":"HKG","bankBranchName":"","bankCode":"","bankName":"DBS Bank (Hong Kong) Limited","businessNo":"2407151336000002604","cardNo":"1688888881","clearingCode":"","countryCode":"HKG","middleBankCountry":"","middleBankName":"","middleSwiftCode":"","payeeAddress":"HKG","paymentChannelType":"SWIFT","phoneNum":"","recordNo":"2407151349000002607","swiftCode":"DHBKHKHH","userNo":"5181240322000274308","zipCode":""}

		//TODO  业务逻辑自行处理
	}
}
