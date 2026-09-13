package com.baofoo.demo.b2b;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;


/**
 * 结汇收款人查询
 * @author mucang
 *
 */
public class QueryPayee {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/payee/queryPayee";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("currentPage", 1);
		dataContentMap.put("pageSize", 20);
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"currentPage":1,"list":[{"accountCcy":"CNY","accountName":"全球有限互联公司","cardNo":"1688888","createAt":"2024-07-15 11:24:59","idNo":"421000195710071340","partnerNo":"2407151124000033545","partnerType":2,"recordNo":"2407151124000002597","state":2},{"accountCcy":"CNY","accountName":"全球有限互联公司","cardNo":"1688888","createAt":"2024-06-20 09:17:38","idNo":"421000195710071340","partnerNo":"2406200917000000939","partnerType":2,"recordNo":"2406200917000000730","state":2},{"accountCcy":"CNY","accountName":"全球有限互联公司","cardNo":"1688888","createAt":"2024-06-19 15:22:07","idNo":"421000195710071340","partnerNo":"2406191522000000786","partnerType":2,"recordNo":"2406191522000000663","state":2},{"accountCcy":"CNY","accountName":"全球有限互联公司","cardNo":"1688888","createAt":"2024-06-19 15:21:56","idNo":"421000195710071340","partnerNo":"2406191521000000782","partnerType":2,"recordNo":"2406191521000000660","state":2},{"accountCcy":"CNY","accountName":"全球有限互联公司","cardNo":"1688888","createAt":"2024-06-19 14:59:53","idNo":"421000195710071340","partnerNo":"2406191459000000780","partnerType":2,"recordNo":"2406191459000000650","state":2},{"accountCcy":"CNY","accountName":"全球有限互联公司","cardNo":"1688888","createAt":"2024-06-19 14:38:08","idNo":"421000195710071340","partnerNo":"2406191438000000755","partnerType":2,"recordNo":"2406191438000000646","state":2},{"accountCcy":"CNY","accountName":"张大","cardNo":"6222026153391483228","createAt":"2024-04-24 16:32:33","idNo":"420101198705296347","partnerNo":"2404241632000016258","partnerType":5,"recordNo":"2404241632000016259","state":1},{"accountCcy":"CNY","accountName":"阿木木","cardNo":"6222023927073137174","createAt":"2024-04-24 14:11:23","idNo":"421000195710071340","partnerNo":"2404241411000016209","partnerType":5,"recordNo":"2404241411000016210","state":1},{"accountCcy":"CNY","accountName":"张宝","cardNo":"6222021030839227090","createAt":"2024-04-23 15:35:57","idNo":"360727199408019102","partnerNo":"2404231535000016174","partnerType":5,"recordNo":"2404231535000016175","state":2},{"accountCcy":"CNY","accountName":"全球有限互联公司","cardNo":"1688888","createAt":"2024-03-22 18:12:21","idNo":"421000195710071340","partnerNo":"2403221812000014500","partnerType":2,"recordNo":"2403221812000014501","state":2}],"pageSize":20,"totalCount":10}

		//TODO  业务逻辑自行处理
	}
}
