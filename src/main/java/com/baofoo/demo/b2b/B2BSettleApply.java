package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 结汇付款申请
 * @author mucang
 *
 */
public class B2BSettleApply {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/settle/b2bSettleApply";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("userReqNo", GepUtils.randomSn());
		dataContentMap.put("paymentCcy", "USD");
		dataContentMap.put("payeeCcy", "CNY");
		dataContentMap.put("fixedModel", 1);//1-固定付款金额，2-固定收款金额
		dataContentMap.put("tradeAmount", "1");
		dataContentMap.put("autoPayment", "1");
		dataContentMap.put("payeeAccountId", "2404231535000016175");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"orderNo":2407151136000031218}

		//TODO  业务逻辑自行处理
	}
}
