package cn.net.xsoft.po;

import java.io.Serializable;

public class Usr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String username;
	private String password;
	
	
	public Usr() {
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public Usr(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
