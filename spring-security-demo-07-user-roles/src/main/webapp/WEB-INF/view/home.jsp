<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<p>
		User :
		<security:authentication property="principal.username" />
	</p>
	<br />
	<br /> Roles:
	<security:authentication property="principal.authorities" />
	<h1>CR7 Company</h1>
	Welcome to CR7 the world of football.
	<br/>
	<security:authorize access="hasRole('MANAGER')">
	<p>
	<a href="${pageContext.request.contextPath}/leaders">LeaderShipMeeting</a>
	</p>
	</security:authorize>
	<br/>
	<security:authorize access="hasRole('ADMIN')">
	<p>
	<a href="${pageContext.request.contextPath}/systems">ITSystemsMeeting</a>
	</p>
	</security:authorize>
	<form:form action="${pageContext.request.contextPath}/logout">
		<input type="submit" value="Logout" />
	</form:form>
</body>
</html>