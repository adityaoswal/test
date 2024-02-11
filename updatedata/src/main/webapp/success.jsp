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
function deleteuser(eid)
{
	alert("delete user");
	document.fn.action="delete/"+eid;
	document.fn.submit();
}

function edituser(eid)
{

	document.fn.action="edit/"+eid;
	document.fn.submit();
}
</script>
<body>
<form name="fn">
<table border="2">
<thead>
<th>Eid</th>
<th>Name</th>
<th>Address</th>
<th>Username</th>
<th>Password</th>
<c:forEach items="${data}" var="u">
<tr>
<td>${u.eid}</td>
<td>${u.ename }</td>
<td>${u.address }</td>
<td>${u.uname }</td>
<td>${u.pass }</td>
<td><input type="button" value="Edit" onclick="edituser(${u.eid})"> </td>
<td><input type ="button" value="Delete" onclick="deleteuser(${u.eid})"></td>
</tr>
</c:forEach>
</thead>


</table>

</form>
</body>
</html>