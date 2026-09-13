package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP 常用收款方信息查询
 * @author mucang
 *
 */
public class QueryUserPartner {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/partner/query-user-partner";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("partnerNo", "2407151516000002618");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountDocument":"","address":"中国上海","businessType":2,"countryCode":"CHN","enName":"GEP Testing Co., Ltd","name":"GEP测试有限公司","partnerNo":"2407151516000002618","partnerType":3,"state":1,"userPayeeAccountInfoRespList":[{"accType":1,"accountCcy":"USD","accountName":"GEP Testing Co., Ltd","bankAddress":"HKG","bankBranchName":"","bankCode":"","bankName":"DBS Bank (Hong Kong) Limited","businessNo":"2407151516000002618","cardNo":"168888888","clearingCode":"","countryCode":"HKG","middleBankCountry":"","middleBankName":"","middleSwiftCode":"","payeeAddress":"HKG","paymentChannelType":"SWIFT","phoneNum":"","recordNo":"2407151516000002619","swiftCode":"DHBKHKHH","userNo":"5181240322000274308","zipCode":""}]}

		//TODO  业务逻辑自行处理
	}
}
