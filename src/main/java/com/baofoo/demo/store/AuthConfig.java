package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.33 电商平台授权
 * @author mucang
 *
 */
public class AuthConfig {
	public static void main(String[] args) {
		String url = "/api/store/authConfig";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("memberTransId", GepUtils.randomSn());
		dataContentMap.put("platformSubCode", "INDEPENDENT-USD");
		dataContentMap.put("storeNo", "2404121455000075720");
		dataContentMap.put("callBackUrl", "");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
