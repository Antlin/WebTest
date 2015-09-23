<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/update_user.action?user.uid=${user.uid}" method="post">
<%-- 修改的ID：<input type="text" name="user.uid"value="${user.uid}"><br> --%>
用户名:<input type="text" name="user.name" value="${user.name}"><br>
年龄:<input type="text" name="user.age" value="${user.age}"><br>
生日:<input type="text" name="user.birtday" value="${user.birtday}"><br>
<input type="submit" value="提交" >
</form>
</body>
</html>