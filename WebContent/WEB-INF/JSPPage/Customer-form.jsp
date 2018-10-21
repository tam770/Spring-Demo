<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="showmecust" modelAttribute="customer">
Fname:= <form:input path="fname"/>
<form:errors path="fname"/><br/><br/>
Lname:= <form:input path="lname"/>
<form:errors path="lname"/><br/><br/>

Phone:= <form:input path="contact"/>
<form:errors path="contact"/><br/><br/>

Postal Code:= <form:input path="postalcode"/>
<form:errors path="postalcode"/><br/><br/>

<input type="submit" value="submit"/>
</form:form>
</body>
</html>