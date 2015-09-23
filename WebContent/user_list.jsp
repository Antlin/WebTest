<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户表</title>
</head>
<body>
<table border="1"  cellpadding="0" cellspacing="0"  width="300">
<tbody>
	<form>
	<tr>
	<th>ID</th>
	<th>姓名</th>
	<th>年龄</th>
	<th>生日</th>
	<th colspan="2">操做</th>
	</tr>
	<c:forEach items="${list}" var="user" varStatus="status">
	<c:if test="${status.count%2==0}"> <tr style="background-color:white" > </c:if>
	<c:if test="${status.count%2!=0}"> <tr  style="background-color:white"> </c:if>
		<td>${user.uid}</td>
	 	<td>${user.name}</td>
		<td>${user.age}</td>
		<td>${user.birtday}</td>
		<td><a href="<%=request.getContextPath()%>/delete_user.action?user.uid=${user.uid}">删除</a></td>
		<td><a href="<%=request.getContextPath()%>/updateFind_user.action?user.uid=${user.uid}">修改</a></td>
		<td><a href="<%=request.getContextPath()%>/add_user.jsp">增加</a></td>
	</c:forEach>
	</form>
</tbody>
</table>
</body>
</html>