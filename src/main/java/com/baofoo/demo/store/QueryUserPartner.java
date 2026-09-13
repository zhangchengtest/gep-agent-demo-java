package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.26 GEP 常用收款方信息查询
 * @author mucang
 *
 */
public class QueryUserPartner {
	public static void main(String[] args) {
		String url = "/api/user/partner/query-user-partner";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("partnerNo", "2407151656000002624");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountDocument":"13330430","address":"上海浦东","businessType":2,"countryCode":"CHN","enName":"zhang bao","expirationContractDate":"2099-01-01","name":"张宝","partnerNo":"2407151656000002624","partnerType":3,"state":1}

		//TODO  业务逻辑自行处理
	}
}
