package com.baofoo.demo.store;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 3.16 电商平台结汇结果查询
 * @author mucang
 *
 */
public class QuerySettleOrder {
	public static void main(String[] args) {
		String url = "/api/settle/query-settle-order";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("certificateId", GepUtils.certificateId);
		dataContentMap.put("userReqNo", "20240715174129-7172488224");
		
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"applyDate":"2024-07-15 17:41:38","costBorne":"OUR","errorFileBatchNo":2407151741000031301,"orderId":2407151741000031301,"payeeAmount":724.98,"payeeCcy":"CNH","paymentAmount":100.00,"paymentCcy":"USD","paymentFeeAmount":0.00,"paymentFeeCcy":"USD","paymentFeeRate":100.000000,"paymentPurpose":1,"paymentSuccessDate":"2024-07-15 17:41:39","remarks":"结汇明细文件处理失败","status":4,"tradeRate":724.980000,"userNo":5181240322000274308,"userReqNo":"20240715174129-7172488224"}

		//TODO  业务逻辑自行处理
	}
}
