<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
<style>
.error{color:red}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
FirstName : <form:input path="firstName"/>
LastName (*): <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
Passes: <form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>
PostalCode: <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
CourseCode: <form:input path="courseCode"></form:input>
<form:errors path="courseCode" cssClass="error"/>
<input type="submit">
</form:form>
</body>
</html>