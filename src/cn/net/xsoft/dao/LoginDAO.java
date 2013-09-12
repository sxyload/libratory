package cn.net.xsoft.dao;

import cn.net.xsoft.po.Usr;

public interface LoginDAO {
	public abstract Usr login(String userName, String passWord) throws Exception;
}
