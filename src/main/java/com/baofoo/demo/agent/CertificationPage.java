package com.baofoo.demo.agent;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.6 分页查询用户
 * @author mucang
 *
 */
public class CertificationPage {
	public static void main(String[] args) {
		String url = "/api/agent/user/certification-page";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");//5181240322000274098/5181240322000274308
		dataContentMap.put("userName", "");
		dataContentMap.put("phoneNumber", "");
		dataContentMap.put("email", "");
		dataContentMap.put("realNameState", "");
		dataContentMap.put("beginTime", "");
		dataContentMap.put("endTime", "");
		dataContentMap.put("currentPage", "1");
		dataContentMap.put("pageSize", "10");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		// result解密信息：{"list":[{"createAt":"2024-07-11 14:08:25","email":"482743916.1810919866241298432@qq.com","realNameState":0,"state":-1,"userNo":5181240711000034438},{"createAt":"2024-07-10 17:32:57","email":"584@ptmlink.com","realNameState":0,"state":-1,"userNo":5181240710000033988},{"createAt":"2024-07-10 17:26:52","email":"374@ptmlink.com","realNameState":0,"state":-1,"userNo":5181240710000033748},{"createAt":"2024-07-09 13:45:02","email":"nejitesting4@gmail.com","realNameState":0,"state":-1,"userNo":5181240709000032668},{"createAt":"2024-07-09 12:06:24","email":"baharuddinkirei@gmail.com","realNameState":0,"state":-1,"userNo":5181240709000032428},{"createAt":"2024-07-09 11:54:28","email":"nanang1085@gmail.com","realNameState":0,"state":-1,"userNo":5181240709000032288},{"createAt":"2024-07-05 10:46:32","email":"kent.tsang@rctech365.com","realNameState":0,"state":-1,"userNo":5181240705000031658},{"createAt":"2024-07-04 15:34:58","email":"zhangkingan@gmail.com","realNameState":0,"state":-1,"userNo":5181240704000031208},{"createAt":"2024-07-04 15:32:26","email":"482743916.1808419331630084096@qq.com","realNameState":0,"state":-1,"userNo":5181240704000031068},{"createAt":"2024-07-02 11:28:56","email":"rezapramita88@gmail.com","realNameState":0,"state":-1,"userNo":5181240702000026608}],"pagination":{"current":1,"pageSize":10,"pages":91,"total":908}}

		//TODO  业务逻辑自行处理
	}
	
}
