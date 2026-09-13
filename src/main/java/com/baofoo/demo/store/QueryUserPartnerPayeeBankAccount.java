package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.29 GEP 常用收款人收款银行帐号信息查询
 * @author mucang
 *
 */
public class QueryUserPartnerPayeeBankAccount {
	public static void main(String[] args) {
		String url = "/api/user/payee-account/query-user-partner-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("recordNo", "2407151657000002625");
		dataContentMap.put("businessNo", "");
		dataContentMap.put("accountCcy", "");
		dataContentMap.put("accountName", "");
		dataContentMap.put("cardNo", "");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		// result解密信息：{"accType":1,"accountCcy":"CNH","accountName":"test account","bankAddress":"shanghai pudong","bankBranchName":"","bankName":"DBS Bank (Hong Kong) Limited","businessNo":"2407151656000002624","cardNo":"168888888","clearingCode":"018","countryCode":"HKG","middleBankCountry":"","middleBankName":"","middleSwiftCode":"","payeeAddress":"shanghai pudong","paymentChannelType":"SWIFT","recordNo":"2407151657000002625","swiftCode":"DHBKHKHH","userNo":"5181240322000274308"}

		//TODO  业务逻辑自行处理
	}
}
