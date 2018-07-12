package com.za.common;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.za.pojo.ZaUser;

public class SessionUser extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6488427147708531297L;
	private ZaUser user;
	
	public SessionUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}
	
	public SessionUser(String username, String password, Collection<? extends GrantedAuthority> authorities,ZaUser user) {
		super(username, password, authorities);
		this.user = user;
	}

	public ZaUser getUser() {
		return user;
	}

	public void setUser(ZaUser user) {
		this.user = user;
	}

	
}
