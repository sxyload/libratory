package cn.net.xsoft.bo;

import cn.net.xsoft.po.Usr;

public interface LoginBO {
	public abstract Usr checkLogin(String userName, String passWord);
}
