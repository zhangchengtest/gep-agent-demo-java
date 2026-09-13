package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 子账户查询
 * @author mucang
 *
 */
public class QuerySubAcc {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/subAcc/querySubAcc";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("applyId", "2407151110000031216");
		dataContentMap.put("userReqNo", "");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"list":[{"accountOfBankName":"DBS Bank (Hong Kong) Limited","accountPayeeType":1,"applyAt":"2024-07-15 11:10:24","applyId":"2407151110000031216","auditStatus":1,"bankAccountName":"QU QIU YOU XIAN HU LIAN","currency":"HKD,CHF,EUR,USD,CAD,AUD,SGD,JPY,GBP,NZD,CNH","goodsArea":"USA","goodsTradeType":"1","goodsType":"015","status":"处理中","statusCode":"1","webUrl":"https://www.baofu.com/link1"}]}

		//TODO  业务逻辑自行处理
	}
}
