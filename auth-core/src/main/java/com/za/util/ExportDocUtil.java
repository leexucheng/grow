package com.za.util;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Base64Utils;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class ExportDocUtil {

	static Configuration config = null;
	public static void generateDoc(List<Map<String,Object>> data) {
		config = Configuration.getDefaultConfiguration();
		config.setClassForTemplateLoading(ExportDocUtil.class, "/");
		config.setDefaultEncoding("utf8");
		
		if(data == null) {
			data = new ArrayList<Map<String,Object>>();
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("shortCode", "12311");
			map.put("innerCode", "building大厦 1#");
			map.put("img", "<img width=300 height=300 src='http://f.hiphotos.baidu.com/image/h%3D300/sign=a72ec69f13178a82d13c79a0c603737f/6c224f4a20a446232cff99319522720e0cf3d7af.jpg'/>");
			Map<String,Object> map2 = new HashMap<String,Object>();
			map2.put("shortCode", "12301");
			map2.put("innerCode", "building洒东 2#");
			map2.put("img", "<img width=300 height=300 src='http://f.hiphotos.baidu.com/image/h%3D300/sign=a72ec69f13178a82d13c79a0c603737f/6c224f4a20a446232cff99319522720e0cf3d7af.jpg'/>");
			Map<String,Object> map3 = new HashMap<String,Object>();
			map3.put("shortCode", "12331");
			map3.put("innerCode", "building 2#");
			map3.put("img", "<img width=300 height=300 src='http://f.hiphotos.baidu.com/image/h%3D300/sign=a72ec69f13178a82d13c79a0c603737f/6c224f4a20a446232cff99319522720e0cf3d7af.jpg'/>");
			data.add(map);data.add(map2);data.add(map3);
		}
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/mydoc/ewm.doc")));
			
			Template t = config.getTemplate("ewm.ftl");
			t.setEncoding("utf8");
			Map<String,Object> model = new HashMap<String,Object>();
			model.put("data",  data);
			t.process(model, writer);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public static String getBase64Img(String path,int type) {
		
		InputStream is = null;
		byte [] data = null;
		try {
			if(type == 1) {
				is = new FileInputStream(path);
			}else {
				is = getStream(path);
			}
			
		    data = new byte[is.available()];
			is.read(data);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String(Base64Utils.encode(data));
	}
	
	public static InputStream getStream(String destUrl){
		HttpURLConnection httpUrl = null;
		URL url = null;
		InputStream in = null; 
		try{
			url = new URL(destUrl);
			httpUrl = (HttpURLConnection) url.openConnection();
			httpUrl.connect();
			in = httpUrl.getInputStream();			
			return in;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		//generateDoc(null);
		System.out.println(getBase64Img("http://f.hiphotos.baidu.com/image/h%3D300/sign=a72ec69f13178a82d13c79a0c603737f/6c224f4a20a446232cff99319522720e0cf3d7af.jpg",2));
	}
}
