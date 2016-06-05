<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>

<h3>Login Successful!</h3>

<%
//User user = (User) session.getAttribute("user");
User user = (User) request.getAttribute("user");

%>

Hello <%=user.getUserName() %>!

<%-- 
// we can still use JSTL to do that!
<jsp:useBean id="user" class="Entity.User" scope="request">

</jsp:useBean>

Hello <jsp:getProperty property="userName" name="user"/>

 --%>
<hr>
<form action="Behave" method="post">
	<input type="radio" name="choice" value = "Add"/>Add 
	<input type="radio" name="choice" value= "Retrieve"/>Retrieve
	<input type="radio" name="choice" value = "Edit"/>Edit
	<input type="radio" name="choice" value = "Delete"/>Delete
	<input type="submit" name = "submit" value = "Submit" />
</form>

</body>
</html>