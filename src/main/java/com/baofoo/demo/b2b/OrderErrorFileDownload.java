package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 结汇订单明细错误文件下载
 * @author mucang
 *
 */
public class OrderErrorFileDownload {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/common/file/order-error-file-download";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("fileBatchNo", "2404231448000077105");
		
		GepUtils.sendRequest(url, dataContentMap, null, false);
		//TODO  业务逻辑自行处理
	}
}
