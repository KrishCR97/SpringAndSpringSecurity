<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
<style>
.error{
color: red;
}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
FirstName: <form:input path="firstName" />
<br/><br/>
LastName: <form:input path="lastName"/>
<br/><br/>
<form:errors path="lastName" cssClass="error"></form:errors>
<br/><br/>
<input type="submit">
</form:form>
</body>
</html>