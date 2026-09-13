package com.baofoo.demo.b2b;

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
		dataContentMap.put("partnerNo", "2407151336000002604");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountDocument":"","address":"中国上海","businessType":2,"countryCode":"CHN","enName":"Global Interconnection Co., Ltd","name":"全球互联有限公司","partnerNo":"2407151336000002604","partnerType":3,"state":1}

		//TODO  业务逻辑自行处理
	}
}
