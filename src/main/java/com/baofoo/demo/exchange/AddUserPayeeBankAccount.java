package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP 用户收款银行帐号信息新增
 * @author mucang
 *
 */
public class AddUserPayeeBankAccount {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/payee-account/add-user-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("accType", "1");//账户类型 1-对公，2-对私
		dataContentMap.put("accountCcy", "USD");
		dataContentMap.put("accountName", "GEP Testing Co., Ltd");
		dataContentMap.put("cardNo", "168888888");
		dataContentMap.put("bankName", "DBS Bank (Hong Kong) Limited");
		dataContentMap.put("bankBranchName", "");
		dataContentMap.put("countryCode", "HKG");
		dataContentMap.put("swiftCode", "DHBKHKHH");
		dataContentMap.put("payeeAddress", "HKG");
		dataContentMap.put("bankAddress", "HKG");
		dataContentMap.put("clearingCode", "");
		dataContentMap.put("middleSwiftCode", "");
		dataContentMap.put("middleBankName", "");
		dataContentMap.put("middleBankCountry", "");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accType":1,"accountCcy":"USD","accountName":"GEP Testing Co., Ltd","bankAddress":"HKG","bankBranchName":"","bankName":"DBS Bank (Hong Kong) Limited","cardNo":"168888888","countryCode":"HKG","payeeAddress":"HKG","recordNo":"2407151543000002621","swiftCode":"DHBKHKHH"}

	}
}
