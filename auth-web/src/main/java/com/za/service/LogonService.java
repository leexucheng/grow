package com.za.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.za.common.SessionUser;
import com.za.pojo.ZaUser;

@Service
public class LogonService implements UserDetailsService {

	@Autowired
	ILoginService loginSrv;
	
	@Override
	public UserDetails loadUserByUsername(String uname) throws UsernameNotFoundException {
		ZaUser u = loginSrv.loadUser(uname);
		System.out.println(u.getPassword());
		if(u != null) {
			List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
			GrantedAuthority au = new SimpleGrantedAuthority("ROLE_USER");
			list.add(au);
			
			return new SessionUser(uname, u.getPassword(), list, u);
		}
		return null;
	}

}
