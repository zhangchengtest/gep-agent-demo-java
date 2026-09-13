package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.21 订单明细错误文件下载
 * @author mucang
 *
 */
public class OrderErrorFileDownload {
	public static void main(String[] args) throws Exception {
		String url = "/api/common/file/order-error-file-download";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("fileBatchNo", "2407111033000030304");
		
		GepUtils.sendRequest(url, dataContentMap, null, false);
		// response:第3行：订单号不允许重复|物流单号不允许重复
		// 
	}
}
