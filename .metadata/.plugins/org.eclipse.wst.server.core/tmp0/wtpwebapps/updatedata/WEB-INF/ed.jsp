<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
Eid<input type="text"  hidden="true"  name="eid" value="${data.eid }">
Name<input type ="text" name="ename" value="${data.ename }">
Address<input type ="text" name ="address" value="${data.address }">
Username<input type="text" name="uname" value="${data.uname }">
Password<input type ="text" name="pass" value="${data.pass }">
<input type ="submit" value ="update">
</form>
</body>
</html>


