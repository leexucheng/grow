package com.za.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordUtil {

	public Map<String,String> encodePwd(String userName,String password,String salt){
		int hashIterations = 2;
		if (StringUtils.isEmpty(salt)) {
			salt = (new SecureRandomNumberGenerator()).nextBytes().toHex();
		}
		String encryptedPassword = new SimpleHash("md5", password, ByteSource.Util.bytes(userName + salt), hashIterations).toHex();
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("password", encryptedPassword);
		map.put("salt", salt);
		
		return map;
	}
	
}
