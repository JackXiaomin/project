<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>注入多类注意避免同名属性</h1>
	<form action="login" method="post">
		<table>
			<tr>
				<td>部门名</td>
				<td><input type="text" name="dname" /></td>
			</tr>
			<tr>
				<td><input type="image" src="image/submit.gif" /></td>
			</tr>
		</table>
	</form>
</body>
</html>