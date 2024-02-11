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
id<input type ="number" hidden="true" name ="eid" value = "${data.eid}"><br>
name<input type ="text" name ="ename" value="${data.ename}"><br>
username<input type ="text" name = "uname" value="${data.uname}"><br>
password<input type ="text" name = "pass" value = "${data.pass}"><br>
<input type ="submit" value = "update">

</form>
</body>
</html>