package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP 常用收款方信息更新
 * @author mucang
 *
 */
public class ModifyUserPartnerOrg {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/partner/modify-user-partner-org";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("partnerNo", "2407151516000002618");
		dataContentMap.put("countryCode", "CHN");
		dataContentMap.put("name", "GEP测试有限公司");
		dataContentMap.put("enName", "GEP Testing Co., Ltd");
		dataContentMap.put("address", "中国上海");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		// result解密信息：{"address":"中国上海","countryCode":"CHN","enName":"GEP Testing Co., Ltd","name":"GEP测试有限公司","partnerNo":2407151516000002618,"partnerType":3}

	}
}
