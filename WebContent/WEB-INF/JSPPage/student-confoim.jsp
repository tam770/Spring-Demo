<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student confiorm</title>
</head>
<body>
 First  Name  := ${Student.fname} <br/> <br/>
 Last   Name  := ${Student.lname} <br/> <br/>
 Country Name := ${Student.country}<br/> <br/>
 Language     := ${Student.lang1}<br/> <br/>
 Choose os  <br/>
    <ul>
    <c:forEach var="temp" items="${Student.os}">
    <li>${temp}</li>
    </c:forEach>
   </ul><br/> <br/>
</body>
</html>