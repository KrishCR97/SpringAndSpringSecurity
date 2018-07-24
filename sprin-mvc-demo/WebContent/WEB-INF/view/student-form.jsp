<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
FirstName : <form:input path="firstName" />
		<br />
LastName : <form:input path="lastName" />
		<br />
Country: <form:select path="country">
			<form:options items="${student.countryOptions}"></form:options>
		</form:select>
		<br />
Favorite Language: 
JAVA <form:radiobutton path="favoriteLanguage" value="Java" />
C++ <form:radiobutton path="favoriteLanguage" value="C++" />
C <form:radiobutton path="favoriteLanguage" value="C" />
Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
		<br />
		MAC<form:checkbox path="operatingSystems" value="MAC" />
		Linux<form:checkbox path="operatingSystems" value="Linux" />
		Windows<form:checkbox path="operatingSystems" value="Windows" />
		<br />
		<input type="submit" />

	</form:form>
</body>
</html>