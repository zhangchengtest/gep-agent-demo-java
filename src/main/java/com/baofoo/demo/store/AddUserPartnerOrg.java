package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.24 GEP 常用收款方信息新增
 * @author mucang
 *
 */
public class AddUserPartnerOrg {
	public static void main(String[] args) {
		String url = "/api/user/partner/add-user-partner-org";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("countryCode", "CHN");
		dataContentMap.put("name", "张宝");
		dataContentMap.put("enName", "zhang bao");
		dataContentMap.put("address", "上海浦东");
		dataContentMap.put("expirationContractDate", "2099-01-01");
		dataContentMap.put("accountDocument", 13330430);
		dataContentMap.put("managementCategory", "11111");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"accountDocument":13330430,"address":"上海浦东","countryCode":"CHN","enName":"zhang bao","expirationContractDate":"2099-01-01","managementCategory":"11111","name":"张宝","partnerNo":2407151656000002624,"partnerType":3}

		//TODO  业务逻辑自行处理
	}
}
