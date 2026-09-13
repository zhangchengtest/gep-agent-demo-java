package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.3 申请开通收款账户
 * @author mucang
 *
 */
public class ApplyPlatformPayeeAccount {
	public static void main(String[] args) {
		String url = "/api/user/account/apply-platform-payee-account";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("platformSubCode", "VINTED-EUR");
		dataContentMap.put("storeName", "你的店铺名");
		dataContentMap.put("managementCategory", "10018");
		dataContentMap.put("sellerId", "10000002");
		dataContentMap.put("mwsKey", "XXXXXXXXXXX");
		dataContentMap.put("authMethod", "2");
		dataContentMap.put("expectYearSalesAmount", "1");
		dataContentMap.put("idNo", "913101045680189677");
		dataContentMap.put("qualifiedType", "2");
		dataContentMap.put("storeUrl", "https://www.baofu.com/link1");
		dataContentMap.put("payServiceCodeStr", "PAYPAL");
		dataContentMap.put("payServiceName", "");
		dataContentMap.put("memberTransId", GepUtils.randomSn());
		dataContentMap.put("callBackUrl", "");
		dataContentMap.put("bankAccountNo", "");
		dataContentMap.put("bankAccountName", "");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"storeNo":2404121455000075720}

		//TODO  业务逻辑自行处理
	}
}
