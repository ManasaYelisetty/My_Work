<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error
{
color:red;
}
</style>
</head>
<body>
<form:form action="saveRegister" modelAttribute="register">
Username<form:input path="username"/><form:errors cssClass="error" path="username"/><br/>
Password<form:password path="password"/><form:errors cssClass="error" path="password"/><br/>
Languages:
C<form:checkbox path="languages" value="C"/>
C++<form:checkbox path="languages" value="C++"/>
Java<form:checkbox path="languages" value="Java"/><form:errors cssClass="error" path="languages"/><br/>

Gender:
Male:<form:radiobutton path="gender" value="Male"/>
Female:<form:radiobutton path="gender" value="Female"/><form:errors cssClass="error" path="gender"/><br/>
DOB:<form:input type="date" path= "dateOfBirth"/><form:errors cssClass="error" path="dateOfBirth"/>
Country:<form:select path="country">
    <form:option value="-" label="--Select Country--"/>
    <form:option value="US" label="United States"/>
    <form:option value="IT" label="Italy"/>
    <form:option value="FRA" label="France"/>
</form:select><form:errors cssClass="error" path="country"/><br/>

<input type="submit" value="Submit"/>
</form:form>
</body>
</html>