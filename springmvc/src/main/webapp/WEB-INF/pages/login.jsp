<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error
{
color:red
}
</style>
</head>
<body>
<form:form action="loginProcess" method="post" modelAttribute="userPojo">
<%-- Enter user id:<form:input path="userId"/><br>
Enter user name:<form:input path="userName"/>
				<form:errors path="userName" cssClass="error"></form:errors><br>
Enter password:<form:input path="password"/><!-- //match property name of pojo file -->
				<form:errors path="password" cssClass="error"></form:errors><br>
<input type="submit" value="Login"> --%>
<!-- i18n -->
<spring:message code="lbl.userid"/><form:input path="userId"/><br>
<spring:message code="lbl.userName"/><form:input path="userName"/>
				<form:errors path="userName" cssClass="error"></form:errors><br>
<spring:message code="lbl.password"/><form:input path="password"/><!-- //match property name of pojo file -->
				<form:errors path="password" cssClass="error"></form:errors><br>
<input type="submit" value="${btn.submit}">

</form:form>
</body>
</html>