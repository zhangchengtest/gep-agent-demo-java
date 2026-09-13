package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 入账交易补全凭证文件
 * @author mucang
 *
 */
public class PayeeDetailUploadVoucherFile {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/declarationOrder/payeeDetailUploadVoucherFile";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("detailId", "2404231759000077144");
		
		dataContentMap.put("voucherFileId", 13331433);
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
