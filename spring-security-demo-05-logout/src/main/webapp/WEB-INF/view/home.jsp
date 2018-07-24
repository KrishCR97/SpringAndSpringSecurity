<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>CR7 Company</h1>
	Welcome to CR7 the world of football.
	<form:form action="${pageContext.request.contextPath}/logout">
		<input type="submit" value="Logout" />
	</form:form>
</body>
</html>