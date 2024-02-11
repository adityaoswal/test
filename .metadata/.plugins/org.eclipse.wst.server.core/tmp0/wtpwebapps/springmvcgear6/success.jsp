<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function deleteuser()
{
	document.fn.action="delete";
	document.fn.submit();
	
	}
	function edituser()
	{
		
		document.fn.action="edit";
		document.fn.submit();
		
	}
</script>
<body>
<form name="fn">
<table border= "2">
<th>serial no</th>
<th>Eid</th>
<th>Name</th>
<th>username</th>
<th>password</th>
<th>action </th>

<c:forEach items="${data}" var ="u">
<tr>
<td><input type = "radio" name ="eid" value ="${u.eid}">
<td>${u.eid }</td>
<td>${u.ename }</td>
<td>${u.uname }</td>
<td>${u.pass }</td>




</tr>
</c:forEach>
<input type = "button" value = "delete" onclick="deleteuser()">
<nput type ="button" value = "edit" onclick="edituser()">
</table>

</form>
</body>
</html>