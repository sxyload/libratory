package cn.net.xsoft.bo.impl;
 
import cn.net.xsoft.bo.LoginBO;
import cn.net.xsoft.dao.LoginDAO;
import cn.net.xsoft.dao.impl.LoginDAOImpl;
import cn.net.xsoft.po.Usr;
 
/**
 * @author X
 * @version v1.0
 * create date 2013-3-11
 */
public class LoginBOImpl implements LoginBO {
 
	private LoginDAO loginDAO = new LoginDAOImpl();
 
	public Usr checkLogin(String userName, String passWord) {
		try{
			Usr usr = loginDAO.login(userName, passWord);
			if (usr!=null) 
				return usr;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
 
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
}