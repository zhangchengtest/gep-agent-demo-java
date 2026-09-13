package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP对公企业信息备案查询
 * @author mucang
 *
 */
public class QueryUserOrgEnregister {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/queryUserOrgEnregister";
		Map<String, Object> dataContentMap = new HashMap<>();		
		dataContentMap.put("orgCode", "123456780");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"areaCode":"310115","createAtStr":"2024-07-15 15:55:12","economyId":"159","industryId":"0759","isTaxfree":1,"linkman":"张三","linkmanTel":"02168819999","orgAddress":"上海","orgCode":"123456780","orgName":"商户公用测试有限公司","postCode":"200000","recordId":"2407151555000031248","status":1,"taxfreeCode":"","userNo":"5181240322000274308"}

		//TODO  业务逻辑自行处理
	}
}
