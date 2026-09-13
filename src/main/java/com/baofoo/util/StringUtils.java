package com.baofoo.util;

public class StringUtils {
	public static String getFileSuffix(byte[] bytes) {
		if (bytes == null || bytes.length < 10)
			return null;
		if (bytes[0] == 71 && bytes[1] == 73 && bytes[2] == 70)
			return "GIF";
		if (bytes[1] == 80 && bytes[2] == 78 && bytes[3] == 71)
			return "PNG";
		if (bytes[6] == 74 && bytes[7] == 70 && bytes[8] == 73 && bytes[9] == 70)
			return "JPG";
		if (bytes[0] == 66 && bytes[1] == 77)
			return "BMP";
		return null;
	}

	public static String getMimeType(byte[] bytes) {
		String mimeType, suffix = getFileSuffix(bytes);
		if ("JPG".equals(suffix)) {
			mimeType = "image/jpeg";
		} else if ("GIF".equals(suffix)) {
			mimeType = "image/gif";
		} else if ("PNG".equals(suffix)) {
			mimeType = "image/png";
		} else if ("BMP".equals(suffix)) {
			mimeType = "image/bmp";
		} else {
			mimeType = "application/octet-stream";
		}
		return mimeType;
	}

	public static boolean isEmpty(String value) {
		int strLen;
		if (value == null || (strLen = value.length()) == 0)
			return true;
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(value.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean areNotEmpty(String... values) {
		boolean result = true;
		if (values == null || values.length == 0) {
			result = false;
		} else {
			for (String value : values)
				result = !isEmpty(value);
		}
		return result;
	}
	
	/**
	 * 将byte[] 转换成字符串
	 */
	public static String byte2Hex(byte[] srcBytes) {
		StringBuilder hexRetSB = new StringBuilder();
		for (byte b : srcBytes) {
			String hexString = Integer.toHexString(0x00ff & b);
			hexRetSB.append(hexString.length() == 1 ? 0 : "").append(hexString);
		}
		return hexRetSB.toString();
	}

	/**
	 * 将16进制字符串转为转换成字符串
	 */
	public static byte[] hex2Bytes(String source) {
		byte[] sourceBytes = new byte[source.length() / 2];
		for (int i = 0; i < sourceBytes.length; i++) {
			sourceBytes[i] = (byte) Integer.parseInt(source.substring(i * 2, i * 2 + 2), 16);
		}
		return sourceBytes;
	}
}
