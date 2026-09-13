package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.28 GEP 常用收款人收款银行帐号信息更新
 * @author mucang
 *
 */
public class ModifyUserPartnerPayeeBankAccount {
	public static void main(String[] args) {
		String url = "/api/user/payee-account/modify-user-partner-payee-bank-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("recordNo", "2407151657000002625");
		dataContentMap.put("businessNo", "2407151656000002624");
		dataContentMap.put("accType", "1");
		dataContentMap.put("accountCcy", "CNH");
		dataContentMap.put("accountName", "test account");
		dataContentMap.put("cardNo", "168888888");
		dataContentMap.put("paymentChannelType", "SWIFT");
		dataContentMap.put("bankName", "DBS Bank (Hong Kong) Limited");
		dataContentMap.put("bankBranchName", "");
		dataContentMap.put("countryCode", "HKG");
		dataContentMap.put("swiftCode", "DHBKHKHH");
		dataContentMap.put("payeeAddress", "shanghai pudong");
		dataContentMap.put("bankAddress", "shanghai pudong");
		dataContentMap.put("clearingCode", "018");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accType":1,"accountCcy":"CNH","accountName":"test account","bankAddress":"shanghai pudong","bankBranchName":"","bankName":"DBS Bank (Hong Kong) Limited","businessNo":"2407151656000002624","cardNo":"168888888","countryCode":"HKG","payeeAddress":"shanghai pudong","recordNo":"2407151657000002625","swiftCode":"DHBKHKHH"}

		//TODO  业务逻辑自行处理
	}
}
