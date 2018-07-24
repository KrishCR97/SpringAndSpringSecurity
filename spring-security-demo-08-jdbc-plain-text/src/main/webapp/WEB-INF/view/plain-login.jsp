<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Login Page</title>
</head>
<body>
	<h3>My Custom Login Page.</h3>
	<form:form
		action="${pageContext.request.contextPath}/authenticateTheUser"
		method="POST">
		<c:if test="${param.error !=null}">
		<i style="color: red;">Sorry! you entered invalid username/password.</i>
		</c:if><br/>
		<input type="text" name="username" placeholder="UserName"/>
		<br />
		<input type="password" name="password" placeholder="Password"/>
		<br />
		<input type="submit" value="Login" />
	</form:form>
</body>
</html>