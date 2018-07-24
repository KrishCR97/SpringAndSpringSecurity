<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
FirstName : <form:input path="firstName"/>
<br/><br/>
LastName : <form:input path="lastName"/>
<br/><br/>
Favorite Language: 
Java <form:radiobutton path="favoriteLanguage" value="Java"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>
<br/><br/>

<input  type="submit"/>
</form:form>
</body>
</html>