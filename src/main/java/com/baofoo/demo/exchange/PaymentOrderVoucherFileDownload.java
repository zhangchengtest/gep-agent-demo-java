package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * GEP 付款凭证文件下载
 * @author mucang
 *
 */
public class PaymentOrderVoucherFileDownload {
	public static void main(String[] args) throws Exception {
		String url = "/api/payment/payment-order-voucher-file-download";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userReqNo", "20240409110756SN5732679924");
		dataContentMap.put("voucherType", "1");
		
		GepUtils.sendRequest(url, dataContentMap, null,false);
		//TODO  业务逻辑自行处理
	}
}
