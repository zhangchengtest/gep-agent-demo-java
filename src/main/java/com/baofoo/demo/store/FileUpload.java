package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.18 电商平台店铺订单明细文件上传
 * @author mucang
 *
 */
public class FileUpload {
	public static void main(String[] args) {
		String url = "/api/user-store-file/file-upload";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("fileId", 13330740);
		dataContentMap.put("fileName", "电商收款模版.xls");
		dataContentMap.put("callBackUrl", "");

		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"callBackUrl":"","fileId":13330740,"fileName":"电商收款模版.xls","userReqNo":"20240715174348-5720701185"}


		//TODO  业务逻辑自行处理
	}
}
