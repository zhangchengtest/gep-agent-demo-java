package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP 用户收款银行帐号信息查询
 * @author mucang
 *
 */
public class QueryUserPayeeBankAccount {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/payee-account/query-user-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		//dataContentMap.put("recordNo", "2404090913000015249");
		dataContentMap.put("accountCcy", "CNH");
		dataContentMap.put("accountName", "GEP Testing Co., Ltd");
		dataContentMap.put("cardNo", "1688888881");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accType":1,"accountCcy":"CNH","accountName":"GEP Testing Co., Ltd","bankAddress":"HKG","bankBranchName":"","bankName":"DBS Bank (Hong Kong) Limited","cardNo":"1688888881","clearingCode":"016","countryCode":"HKG","middleBankCountry":"","middleBankName":"","middleSwiftCode":"","payeeAddress":"HKG","recordNo":"2407151543000002621","swiftCode":"DHBKHKHH","userNo":"5181240322000274308"}

		//TODO  业务逻辑自行处理
	}
}
