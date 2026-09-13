package com.baofoo.demo.agent;

import java.util.HashMap;
import java.util.Map;

import com.baofoo.util.FileItem;
import com.baofoo.util.GepUtils;

/**
 * 2.3.1 HTTP文件上传接口
 * @author mucang
 *
 */
public class AgentUploadFile {
	public static void main(String[] args) {
		String url = "/api/agent/common/file/upload-file";
		
		Map<String, Object> dataContentMap = new HashMap<>();
		dataContentMap.put("userNo", "5181240322000274308");
		dataContentMap.put("fileType", "LICENSE_REAL_NAME");
		
		String path = System.getProperty("user.dir") + "/src/main/webapp/file/test.jpg";
		FileItem item = new FileItem(path);
		dataContentMap.put("fileName", item.getFileName());
		dataContentMap.put("fileMd5encryption", item.getFileMd5encryption());
		
		 Map<String, FileItem> fileParams = new HashMap<String, FileItem>();
		 fileParams.put("file", item);
		 
		 GepUtils.sendRequest(url, dataContentMap, fileParams, true);
		 //result解密信息：{"fileId":13331433,"fileMd5encryption":"ae01753237194fa9a5badf2d90fd20d6","fileName":"test.jpg","userNo":5181240322000274308}
		 // ID_FRONT_REAL_NAME - 13331433
		 //ID_REVERSE_REAL_NAME - 13331435
		 //ID_HOLD_REAL_NAME - 13331436
		 //LICENSE_REAL_NAME - 13331437
		 
	}
}
