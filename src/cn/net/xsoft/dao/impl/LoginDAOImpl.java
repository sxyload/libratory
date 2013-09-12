package cn.net.xsoft.dao.impl;

import java.util.List;

import log.LogTrace;
import log.LogTrace.LogLevel;

import org.springframework.orm.hibernate3.HibernateTemplate;

import cn.net.xsoft.dao.LoginDAO;
import cn.net.xsoft.po.Usr;

public class LoginDAOImpl implements LoginDAO {

	HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	public Usr login(String userName, String passWord) throws Exception {
		// TODO Auto-generated method stub
		List<Usr> list = getHibernateTemplate().find(
				"from Usr as u where u.username = ? and u.password = ?",
				new Object[] {userName, passWord });
		LogTrace.log(LogLevel.debug, String.valueOf(list.size()), this);
		if (list.size() == 1)
			return list.get(0);
		return null;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
