package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP对公企业信息备案新增
 * @author mucang
 *
 */
public class AddUserOrgEnregister {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/addUserOrgEnregister";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("areaCode", "310115");
		dataContentMap.put("economyId", "159");
		dataContentMap.put("industryId", "0759");
		dataContentMap.put("isTaxfree", "1");
		dataContentMap.put("taxfreeCode", "");
		dataContentMap.put("linkman", "张三");
		dataContentMap.put("linkmanTel", "02168819999");
		dataContentMap.put("orgAddress", "上海");
		dataContentMap.put("orgCode", "123456780");
		dataContentMap.put("orgName", "商户公用测试有限公司");
		dataContentMap.put("postCode", "200000");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		// result解密信息：{"areaCode":"310115","createAtStr":"2024-07-15 15:55:12","economyId":"159","industryId":"0759","isTaxfree":1,"linkman":"张三","linkmanTel":"02168819999","orgAddress":"上海","orgCode":"123456780","orgName":"商户公用测试有限公司","postCode":"200000","recordId":"2407151555000031248","status":1,"taxfreeCode":"","userNo":"5181240322000274308"}

	}
}
