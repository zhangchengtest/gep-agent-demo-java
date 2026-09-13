package com.baofoo.demo.agent;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.2 创建用户
 * @author mucang
 *
 */
public class CreateUser {
	public static void main(String[] args) {
		String url = "/api/agent/user/createUser";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("email", "676931854@qq.com");

		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
