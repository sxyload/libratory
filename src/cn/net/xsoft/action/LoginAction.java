package cn.net.xsoft.action;

import log.LogTrace;
import log.LogTrace.LogLevel;
import cn.net.xsoft.bo.LoginBO;
import cn.net.xsoft.bo.impl.LoginBOImpl;
import cn.net.xsoft.po.Usr;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String passWord;
	
	LoginBO loginBO;
	
	public String login() throws Exception {
		LogTrace.log(LogLevel.debug, userName+" "+passWord, this);
		Usr usr = loginBO.checkLogin(userName, passWord);
		if (usr != null) {
			ActionContext.getContext().getSession().put("usr",usr);
			return this.SUCCESS;
		}
		return this.ERROR;
	}
	
	public String logout() throws Exception {
		ActionContext.getContext().getSession().remove("usr");
		ActionContext.getContext().getSession().clear();
		return this.SUCCESS;
	}
	
	public void setLoginBO(LoginBO loginBO) {
		this.loginBO = loginBO;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
