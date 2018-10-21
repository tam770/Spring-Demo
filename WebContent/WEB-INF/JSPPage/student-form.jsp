<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
  <%@  taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${massege}
<form:form action="showme2" modelAttribute="Student">
First Name :<form:input path="fname"/><br/><br/>
Last  Name :<form:input path="lname"/><br/><br/>

select Country:<form:select path="country">
			<form:options items="${Student.lhm}"/>
		</form:select>
		<br/><br/>
		
Select language:<br/>
java <form:radiobutton path="lang1" value="java"/>
python <form:radiobutton path="lang1" value="python"/>
c# <form:radiobutton path="lang1" value="c#"/>
c++ <form:radiobutton path="lang1" value="c++"/>

<br/><br/>

choose operating System:<br/>
Boss<form:checkbox path="os"  value="Boss"/>
linux<form:checkbox path="os"  value="linux"/>
unix<form:checkbox path="os"  value="unix"/>
windows<form:checkbox path="os"  value="windows"/>
<br/><br/>

<input type="submit" name="submit">
</form:form>
</body>
</html>