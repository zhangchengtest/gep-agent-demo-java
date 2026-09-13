package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.34 B2B结汇垫资额度查询
 * @author mucang
 *
 */
public class QuotaQuery {
	public static void main(String[] args) {
		String url = "/api/agent/settle/quota-query";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"createAt":"2024-07-15 13:23:40","status":3,"surplusQuota":46828.97,"userNo":5181240322000274308}

		//TODO  业务逻辑自行处理
	}
}
