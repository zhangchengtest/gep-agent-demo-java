package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.35 电商平台店铺补充材料接口
 * @author mucang
 *
 */
public class StoreBind {
	public static void main(String[] args) {
		String url = "/api/store/storeBind";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("storeNo", "2404121455000075720");
		dataContentMap.put("orderFileId", 13330095);
		dataContentMap.put("payServiceImgId", 13330095);
		dataContentMap.put("storeImgId", 13330095);
		dataContentMap.put("payServiceOrderFileId", 13330095);
		dataContentMap.put("callBackUrl", "http://10.0.60.55/notify");
		dataContentMap.put("storeName", "你的店铺名");
		dataContentMap.put("storeUrl", "https://www.baofu.com/link1");
		dataContentMap.put("payServiceCodeStrList", "SHOPIFY_PAYMENTS");
		dataContentMap.put("payServiceName", "");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：true
		//TODO  业务逻辑自行处理
	}
}
