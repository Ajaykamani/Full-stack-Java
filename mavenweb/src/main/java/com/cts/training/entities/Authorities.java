package com.cts.training.entities;

import javax.persistence.Column;

public class Authorities {
public Authorities() {
		
	}
    public Authorities(String userName, String authority) {
    	super();
    	this.userName=userName;
    	this.authority=authority;
		
	}
    @Column
	private String userName;
	@Column
	private String authority;
	
	

	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "Authorities [ userName=" + userName + ", authority=" + authority + "]";
		}

}
