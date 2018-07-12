package com.za.api.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.za.api.dao.ZaUserMapper;
import com.za.api.dao.ZaUserRoleMapper;
import com.za.pojo.ZaUserExample;
import com.za.service.ILoginService;

public class DubboMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("dubbo.xml");
		
		/*ZaUserMapper dao = ac.getBean(ZaUserMapper.class);
		
		dao.deleteByPrimaryKey("13");*/
		
		ac.start();
		System.out.println("====started=====");
		
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
