package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 结汇收款人删除
 * @author mucang
 *
 */
public class DelPayee {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/payee/delPayee";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("partnerNo", "2404231542000016177");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：true
		//TODO  业务逻辑自行处理
	}
}
