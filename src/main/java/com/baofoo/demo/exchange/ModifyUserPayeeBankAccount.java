package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP 用户收款银行帐号信息更新
 * @author mucang
 *
 */
public class ModifyUserPayeeBankAccount {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/payee-account/modify-user-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("recordNo", "2407151543000002621");
		dataContentMap.put("accType", "1");//账户类型 1-对公，2-对私
		dataContentMap.put("accountCcy", "CNH");
		dataContentMap.put("accountName", "GEP Testing Co., Ltd");
		dataContentMap.put("cardNo", "1688888881");
		dataContentMap.put("bankName", "DBS Bank (Hong Kong) Limited");
		dataContentMap.put("bankBranchName", "");
		dataContentMap.put("countryCode", "HKG");
		dataContentMap.put("swiftCode", "DHBKHKHH");
		dataContentMap.put("payeeAddress", "HKG");
		dataContentMap.put("bankAddress", "HKG");
		dataContentMap.put("clearingCode", "016");
		dataContentMap.put("middleSwiftCode", "");
		dataContentMap.put("middleBankName", "");
		dataContentMap.put("middleBankCountry", "");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		// result解密信息：{"accType":1,"accountCcy":"CNH","accountName":"GEP Testing Co., Ltd","bankAddress":"HKG","bankBranchName":"","bankName":"DBS Bank (Hong Kong) Limited","cardNo":"1688888881","countryCode":"HKG","payeeAddress":"HKG","recordNo":"2407151543000002621","swiftCode":"DHBKHKHH"}

	}
}
