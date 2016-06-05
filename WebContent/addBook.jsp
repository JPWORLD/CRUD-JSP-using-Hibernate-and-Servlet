<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create a new book</title>
</head>
<body>
Please input the information of the book you want to add:
<hr>
<form action="addBook" method="post">


	<br><input type="text" name="Name" />
	<br><input type="text" name="Author" />
	<br><input type="text" name="State" />
	<br><input type="text" name="Pub_Date" />
	<input type="submit" />

</form>

</hr>

</body>
</html>