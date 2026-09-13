package com.baofoo.demo.agent;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.GepUtils;

/**
 * 实名信息详情
 * @author mucang
 *
 */
public class CertificationDetail {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/user/certification-detail";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181260913000526908");
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//result解密信息：{"information":{"address":"市区","area":"中山区","areaCode":"210202","birthDate":"2000-01-01","city":"大连市","cityCode":"210200","countryCode":"CHN","countryCodeDesc":"中国","enName":"MU MU","idFront":13242461,"idFrontUrl":"https://vgw.baofoo.com/group1/M00/4F/73/CgAVg2X9KH2AbEsTAAJ3b4vFYeo453.jpg?token=9f2167494247142dc52457a4eb2504e6&ts=1721011121","idHold":13242463,"idHoldUrl":"https://vgw.baofoo.com/group1/M00/4F/73/CgAVg2X9KH6AXjPHAAJ3b4vFYeo757.jpg?token=bbec2e4584a288aed559547cb831abd7&ts=1721011121","idNo":"421000195710071340","idReverse":13242462,"idReverseUrl":"https://vgw.baofoo.com/group1/M00/4B/6D/CgAVhGX9KH2AGBMaAAJ3b4vFYeo895.jpg?token=01f8dcb79c1bc959200370f6a8e5d97e&ts=1721011121","legalCertExpiryDate":"2050-01-01","name":"木木","postCode":"116000","province":"辽宁省","provinceCode":"210000"},"qualifiedNo":2403221443000014489,"realNameAuditType":1,"realNameStatus":2,"remarks":"","userNo":5181240322000274098,"userType":1}

		//TODO  业务逻辑自行处理
	}
}
