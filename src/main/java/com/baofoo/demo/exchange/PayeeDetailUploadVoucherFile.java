package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * GEP入账凭证文件上传
 * @author mucang
 *
 */
public class PayeeDetailUploadVoucherFile {
	public static void main(String[] args) throws Exception {
		String url = "/api/payee/payeeDetailUploadVoucherFile";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("detailsId", "2405071031000078336");
		
		dataContentMap.put("voucherFileId", 13330095);
		
		GepUtils.sendRequest(url, dataContentMap, null,true);
	}
}
