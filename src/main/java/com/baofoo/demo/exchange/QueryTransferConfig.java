package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 查询转账关系配置接口
 * 此接口只支持代理商发起
 * @author mucang
 *
 */
public class QueryTransferConfig {
	public static void main(String[] args) throws Exception {
		String url = "/api/user/productOpenApply/query-transfer-config";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("payeeUserNo", "5181240322000274308");
		
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"changeContent":"转账关系配置","msg":"","payeeUserNo":5181240322000274308,"remarks":"","status":1,"userNo":5181240322000274308}

		//TODO  业务逻辑自行处理
	}
}