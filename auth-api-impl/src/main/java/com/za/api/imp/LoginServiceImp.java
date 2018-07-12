package com.za.api.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.za.api.dao.ZaUserMapper;
import com.za.pojo.ZaUser;
import com.za.pojo.ZaUserExample;
import com.za.service.ILoginService;

@Service
public class LoginServiceImp implements ILoginService {

	@Autowired
	ZaUserMapper userDao;
	
	public ZaUser loadUser(String uname) {
		ZaUserExample user = new ZaUserExample();
		user.createCriteria().andLoginNameEqualTo(uname);
		
		List<ZaUser> list = userDao.selectByExample(user);
		
		if(list.size() > 0)
			return list.get(0);
		else
			return null;
	}

}
