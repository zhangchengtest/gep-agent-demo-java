package com.baofoo.demo.exchange;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.FileItem;
import com.baofoo.util.GepUtils;

/**
 * 2.3.1 HTTP文件上传接口
 * @author mucang
 *
 */
public class UploadFile {
	public static void main(String[] args) {
		String url = "/api/common/file/upload-file";
		
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", GepUtils.userNo);
		dataContentMap.put("fileType", "2");
		
		String path = System.getProperty("user.dir") + "/src/main/webapp/file/test.jpg";
		FileItem item = new FileItem(path);
		dataContentMap.put("fileName", item.getFileName());
		dataContentMap.put("fileMd5encryption", item.getFileMd5encryption());
		
		 Map<String, FileItem> fileParams = new HashMap<String, FileItem>();
		 fileParams.put("file", item);
		 
		 GepUtils.sendRequest(url, dataContentMap, fileParams, true);
		 //result解密信息：{"fileId":13330095,"fileMd5encryption":"ae01753237194fa9a5badf2d90fd20d6","fileName":"test.jpg","userNo":5181200731000138828}
		//test.jpg-13330110、13330220、13330430/13332024

	}
}
