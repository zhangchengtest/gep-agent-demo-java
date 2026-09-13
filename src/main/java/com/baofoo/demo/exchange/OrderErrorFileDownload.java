package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP 结汇订单明细错误文件下载
 * @author mucang
 *
 */
public class OrderErrorFileDownload {
	public static void main(String[] args) throws Exception {
		String url = "/api/common/file/order-error-file-download";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("fileBatchNo", "2404091621000075190");
		
		GepUtils.sendRequest(url, dataContentMap, null, false);
	}
}
