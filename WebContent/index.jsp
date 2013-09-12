<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Lib</title>
</head>
<body>
	<s:if test="#session.usr == null">
		请登录：
		<form action="./Lib/login" method="post">
			账号： <input type="text" id="userName" name="userName" tabindex="1">
			密码： <input type="password" id="passWord" name="passWord" tabindex="2">
			<input type="submit" value="登录">
		</form>
	</s:if>
	<s:else>
		欢迎你：<s:property value="#session.usr.username" />
		&nbsp;<a href="./Lib/logout">注销</a>
	</s:else>
</body>
</html>