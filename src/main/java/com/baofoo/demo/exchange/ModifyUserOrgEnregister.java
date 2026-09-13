package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP对公企业信息备案修改
 * @author mucang
 *
 */
public class ModifyUserOrgEnregister {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/modifyUserOrgEnregister";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("recordId", "2407151555000031248");//记录编号
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
	}
}
