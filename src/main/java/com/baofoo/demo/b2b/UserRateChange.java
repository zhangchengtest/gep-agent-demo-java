package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.35 用户汇率bp调整申请
 * @author mucang
 *
 */
public class UserRateChange {
	public static void main(String[] args) {
		String url = "/api/user/user-rate-bp/user-rate-change";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("bizType", "0");//业务类型:0-全局;1-GEP收款;3-电商收款;4-E贸汇
		dataContentMap.put("sourceCcy", "AUD");
		dataContentMap.put("destCcy", "CNH");
		dataContentMap.put("closingType", "TOD");
		dataContentMap.put("floatRateType", "1");//汇率浮动类型：1-BP;2-百分比
		dataContentMap.put("buyAdjustType", "1");//1-上浮 2-下调
		dataContentMap.put("buyRateVal", "10");
		dataContentMap.put("sellAdjustType", "2");//1-上浮 2-下调
		dataContentMap.put("sellRateVal", "10");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：true
		//TODO  业务逻辑自行处理
	}
}
