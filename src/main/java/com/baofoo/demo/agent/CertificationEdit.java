package com.baofoo.demo.agent;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.baofoo.util.GepUtils;

/**
 * 修改实名信息，认证失败才能修改
 * @author mucang
 *
 */
public class CertificationEdit {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String url = "/api/agent/user/certification-edit";
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181260913000526908");
		dataContentMap.put("userType", "5");//1-境内个人 2-境内企业 3-香港企业 5-其他地区企业
		dataContentMap.put("callBackUrl", "");
		
		Map<String, Object> informationMap = new HashMap<>();
		if("1".equals(dataContentMap.get("userType"))) { //1-境内个人 
			informationMap.put("idFront", 13331433);
			informationMap.put("idReverse", 13331435);
			informationMap.put("idHold", 13331436);
			informationMap.put("idNo", "421000198806061343");
			informationMap.put("name", "木木");
			informationMap.put("legalCertExpiryDate", "2050-01-01");
			informationMap.put("birthDate", "1988-06-06");
			informationMap.put("province", "210000_辽宁省");
			informationMap.put("city", "210200_大连市");
			informationMap.put("area", "210202_中山区");
			informationMap.put("address", "市区");
			informationMap.put("postCode", "");	
		}else if("2".equals(dataContentMap.get("userType"))) {// 2-境内企业
			informationMap.put("license", 13331433);
			informationMap.put("licenseNo", "913101045680189677");
			informationMap.put("name", "全球有限互联公司");
			informationMap.put("enName", "QU QIU YOU XIAN HU LIAN");
			informationMap.put("companyType", "有限责任公司");
			informationMap.put("registerProvince", "210000_辽宁省");
			informationMap.put("registerCity", "210200_大连市");
			informationMap.put("registerArea", "210202_中山区");
			informationMap.put("registerAddress", "某个地方");
			informationMap.put("legalRepresentative", "阿木木");	
			informationMap.put("registerAmt", "100");	
			informationMap.put("registerCcy", "CNY");	
			informationMap.put("registerDate", "2000-01-01");	
			informationMap.put("endDate", "2099-01-01");	
			informationMap.put("managementScope", "经营范围");	
			informationMap.put("province", "210000_辽宁省");	
			informationMap.put("city", "210200_大连市");	
			informationMap.put("area", "210202_中山区");	
			informationMap.put("address", "某个地方");
			informationMap.put("industryId", "0313");
			informationMap.put("economyId", "159");
			informationMap.put("legalIdType", "2");	
			informationMap.put("legalIdFront", 13331435);
			informationMap.put("legalIdReverse", null);	
			informationMap.put("legalIdHold", 13331436);	
			informationMap.put("legalIdNo", "421000198806061343");
			informationMap.put("legalName", "阿木木");
			informationMap.put("legalBirthDate", "1988-06-06");
			informationMap.put("legalCertExpiryDate", "2050-01-01");
			informationMap.put("legalProvince", "210000_辽宁省");
			informationMap.put("legalCity", "210200_大连市");
			informationMap.put("legalArea", "210202_中山区");
			informationMap.put("legalAddress", "一个村庄");
			informationMap.put("legalCountryCode", "CHN");
			informationMap.put("beneficiaryIdType", new Number[] {1});
			informationMap.put("beneficiaryIdFront", new Number[] {13331435});
			informationMap.put("beneficiaryIdReverse", new Number[] {13331436});
			informationMap.put("beneficiaryIdNo", new String[] {"421000198806061343"});
			informationMap.put("beneficiaryName", new String[] {"阿木木"});
			informationMap.put("beneficiaryBirthDate", new String[] {"1988-06-06"});
			informationMap.put("beneficiaryCertExpiryDate", new String[] {"2050-01-01"});
			informationMap.put("beneficiaryProvince", new String[] {"210000_辽宁省"});
			informationMap.put("beneficiaryCity", new String[] {"210200_大连市"});
			informationMap.put("beneficiaryArea",  new String[] {null});
			informationMap.put("beneficiaryAddress", new String[] {"一个村庄"});
			informationMap.put("beneficiaryShareholderRatio", new Number[] {100});
			informationMap.put("beneficiaryCountry", new String[] {"CHN"});
		}else if("3".equals(dataContentMap.get("userType"))) {// 3-香港企业
			informationMap.put("businessRegister", 13331433);
			informationMap.put("declarationForm", 13331433);
			informationMap.put("incorporationForm", 13331433);
			informationMap.put("orgRegister", 13331433);
			informationMap.put("stockCertificate", 13331433);
			informationMap.put("name", "全球有限互联公司");
			informationMap.put("enName", "QU QIU YOU XIAN HU LIAN");
			informationMap.put("orgRegisterNo", "11000001");
			informationMap.put("businessRegisterNo", "11000002");
			informationMap.put("businessRegisterExpiryDate", "2025-06-01");
			informationMap.put("registerDate", "2000-01-01");
			informationMap.put("registerAmt", "100");			
			informationMap.put("registerProvince", "210000_辽宁省");
			informationMap.put("registerCity", "210200_大连市");
			informationMap.put("registerArea", "210202_中山区");
			informationMap.put("registerAddress", "某个地方");
			informationMap.put("province", "210000_辽宁省");	
			informationMap.put("city", "210200_大连市");	
			informationMap.put("area", "210202_中山区");	
			informationMap.put("address", "某个地方");
			informationMap.put("directorIdType", "1");
			informationMap.put("directorIdFront", 13331433);
			informationMap.put("directorIdReverse", 13331433);
			informationMap.put("directorIdHold", 13331433);
			informationMap.put("directorIdNo", "421000198806061343");
			informationMap.put("directorName", "阿木木");
			informationMap.put("directorBirthDate", "1988-06-06");
			informationMap.put("directorCertExpiryDate", "2042-01-01");
			informationMap.put("directorProvince", "210000_辽宁省");
			informationMap.put("directorCity", "210200_大连市");
			informationMap.put("directorArea", "210202_中山区");
			informationMap.put("directorAddress", "某个地方");
			informationMap.put("directorCountryCode", "CHN");	
			
			informationMap.put("beneficiaryIdType", new Number[] {1});
			informationMap.put("beneficiaryIdFront", new Number[] {13331435});
			informationMap.put("beneficiaryIdReverse", new Number[] {13331436});
			informationMap.put("beneficiaryIdNo", new String[] {"421000198806061343"});
			informationMap.put("beneficiaryName", new String[] {"阿木木"});
			informationMap.put("beneficiaryBirthDate", new String[] {"1988-06-06"});
			informationMap.put("beneficiaryCertExpiryDate", new String[] {"2050-01-01"});
			informationMap.put("beneficiaryProvince", new String[] {"210000_辽宁省"});
			informationMap.put("beneficiaryCity", new String[] {"210200_大连市"});
			informationMap.put("beneficiaryArea",  new String[] {null});
			informationMap.put("beneficiaryAddress", new String[] {"一个村庄"});
			informationMap.put("beneficiaryShareholderRatio", new Number[] {100});
			informationMap.put("beneficiaryCountry", new String[] {"CHN"});
		}else if("5".equals(dataContentMap.get("userType"))) {
			informationMap.put("orgRegister", 123123);
			informationMap.put("otherAccessories", 123123);
			informationMap.put("registerCountry", "USA");
			informationMap.put("name", "全球有限互联公司");
			informationMap.put("enName", "QU QIU YOU XIAN HU LIAN");
			informationMap.put("orgRegisterNo", "11000001");
			informationMap.put("registerDate", "2000-01-01");
			informationMap.put("registerAmt", "100");
			informationMap.put("registerProvince", "210000_辽宁省");
			informationMap.put("registerCity", "210200_大连市");
			informationMap.put("registerArea", "210202_中山区");
			informationMap.put("registerAddress", "某个地方");
			informationMap.put("province", "210000_辽宁省");	
			informationMap.put("city", "210200_大连市");	
			informationMap.put("area", "210202_中山区");	
			informationMap.put("address", "某个地方");
			informationMap.put("postCode", "12345");

			informationMap.put("directorIdType", new Number[] {1});
			informationMap.put("directorIdFront",  new Number[] {13331433});
			informationMap.put("directorIdReverse",  new Number[] {13331433});
			informationMap.put("directorIdHold",  new Number[] {13331433});
			informationMap.put("directorIdNo", new String[] {"421000198806061343"});
			informationMap.put("directorName", new String[] {"阿木木"});
			informationMap.put("directorBirthDate", new String[] {"1988-06-06"});
			informationMap.put("directorCertExpiryDate", new String[] {"2042-01-01"});
			informationMap.put("directorProvince", new String[] {"210000_辽宁省"});
			informationMap.put("directorCity", new String[] {"210200_大连市"});
			informationMap.put("directorArea", new String[] {"210202_中山区"});
			informationMap.put("directorAddress", new String[] {"某个地方"});
			informationMap.put("directorCountryCode",  new String[] {"CHN"});	
			
			informationMap.put("beneficiaryIdType", new Number[] {1});
			informationMap.put("beneficiaryIdFront", new Number[] {13331435});
			informationMap.put("beneficiaryIdReverse", new Number[] {13331436});
			informationMap.put("beneficiaryIdNo", new String[] {"421000198806061343"});
			informationMap.put("beneficiaryName", new String[] {"阿木木"});
			informationMap.put("beneficiaryBirthDate", new String[] {"1988-06-06"});
			informationMap.put("beneficiaryCertExpiryDate", new String[] {"2050-01-01"});
			informationMap.put("beneficiaryProvince", new String[] {"210000_辽宁省"});
			informationMap.put("beneficiaryCity", new String[] {"210200_大连市"});
			informationMap.put("beneficiaryArea",  new String[] {null});
			informationMap.put("beneficiaryAddress", new String[] {"一个村庄"});
			informationMap.put("beneficiaryShareholderRatio", new Number[] {100});
			informationMap.put("beneficiaryCountry", new String[] {"CHN"});
																				
		}
		dataContentMap.put("information", JSONObject.toJSON(informationMap));
		
		GepUtils.sendRequest(url, dataContentMap, null, true);
		//TODO  业务逻辑自行处理
	}
}
