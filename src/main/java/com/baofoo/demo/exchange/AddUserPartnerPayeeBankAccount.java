package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP 常用收款人收款银行帐号信息新增
 * @author mucang
 *
 */
public class AddUserPartnerPayeeBankAccount {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/payee-account/add-user-partner-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("businessNo", "2407151516000002618");
		dataContentMap.put("accType", "1");//收款人类型 1-企业，2-个人
		dataContentMap.put("accountCcy", "USD");
		dataContentMap.put("accountName", "GEP Testing Co., Ltd");
		dataContentMap.put("cardNo", "168888888");
		dataContentMap.put("paymentChannelType", "SWIFT");//SWIFT、LOCAL、 BILLPAY、BPAY
		dataContentMap.put("bankName", "DBS Bank (Hong Kong) Limited");
		dataContentMap.put("bankCode", "");
		dataContentMap.put("bankBranchName", "");
		dataContentMap.put("countryCode", "HKG");
		dataContentMap.put("swiftCode", "DHBKHKHH");
		dataContentMap.put("payeeAddress", "HKG");
		dataContentMap.put("bankAddress", "HKG");
		dataContentMap.put("clearingCode", "");
		dataContentMap.put("middleSwiftCode", "");
		dataContentMap.put("middleBankName", "");
		dataContentMap.put("middleBankCountry", "");
		dataContentMap.put("cardType", "");
		dataContentMap.put("phoneNum", "");
		dataContentMap.put("province", "");
		dataContentMap.put("city", "");
		dataContentMap.put("zipCode", "");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accType":1,"accountCcy":"USD","accountName":"GEP Testing Co., Ltd","bankAddress":"HKG","bankBranchName":"","bankCode":"","bankName":"DBS Bank (Hong Kong) Limited","businessNo":"2407151516000002618","cardNo":"168888888","countryCode":"HKG","payeeAddress":"HKG","phoneNum":"","recordNo":"2407151516000002619","swiftCode":"DHBKHKHH","zipCode":""}

	}
}
