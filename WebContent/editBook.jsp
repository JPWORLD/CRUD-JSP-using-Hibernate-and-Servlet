<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Please input the name of the book you want to edit: 
<hr>
<form action="editBook" method="post">

	<br>Name: <input type="text" name="Name" />
	<br>Author: <input type="text" name="Author" />
	<br>Pages: <input type="text" name="Pages" />
	<br>State: 
	<input type="radio" name="State" value="UnBooked">Unbooked</input>
	<input type="radio" name="State" value="Booked">Booked</input>
	<br>Pub_Date<input type="text" name="Pub_Date" pattern="MM-dd-yyyy" />
	<input type="submit" />

</form>
</hr>
</body>
</html>