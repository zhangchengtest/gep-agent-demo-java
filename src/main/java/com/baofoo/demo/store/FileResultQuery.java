package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.19 电商平台店铺订单明细文件处理结果查询
 * @author mucang
 *
 */
public class FileResultQuery {
	public static void main(String[] args) {
		String url = "/api/user-store-file/file-result-query";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userReqNo", "20240715174348-5720701185");
		
		dataContentMap.put("userNo", GepUtils.userNo);

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"fileName":"电商收款模版.xls","handleStatus":2,"userNo":5181240322000274308,"userReqNo":"20240715174348-5720701185"}

		//result解密信息：{"fileName":"电商收款模版.xls","handleErrorNo":2407111033000030304,"handleStatus":5,"remarks":"商户API上传文件校验失败","userNo":5181200731000138828,"userReqNo":"20240711103307-5180132030"}

		//TODO  业务逻辑自行处理
	}
}
