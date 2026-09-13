package com.baofoo.demo.b2b;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 2.3.7 子账户开户
 * @author mucang
 *
 */
public class ApplySubAcc {

	public static void main(String[] args) {
		String url = "/api/agent/subAcc/applySubAcc";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("accountPayeeType", "1");//1-全球收款，2-本地收款
		dataContentMap.put("country", "HKG");
		dataContentMap.put("bankCode", "1");
		dataContentMap.put("webUrl", "https://www.baofu.com/link1");
		dataContentMap.put("goodsType", "015");
		dataContentMap.put("goodsArea", "USA");
		dataContentMap.put("goodsTradeType", "1");
		dataContentMap.put("goodsFileNo", "");
		dataContentMap.put("callBackUrl", "http://10.0.60.55:8083/notify");
		dataContentMap.put("exceptYearSalesAmount", "1");
		dataContentMap.put("platformType", "Independent station");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"applyId":2407151110000031216}
		//TODO  业务逻辑自行处理
	}
	
}
