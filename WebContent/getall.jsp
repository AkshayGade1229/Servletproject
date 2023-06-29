
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style>
body {
	font-family: sans-serif;
	background: #F0E0F0;
}

.container {
	position: absolute;
	top: 40%;
	left: 50%;
	width: 800px;
	padding: 60px;
	transform: translate(-50%, -50%);
	box-sizing: border-box;
	box-shadow: 0 15px 25px rgba(0, 0, 0, .6);
	border-radius: 10px;
}

h1:hover {
	border-radius: 5px;
	box-shadow: 0 0 5px #03e9f4, 0 0 25px #03e9f4, 0 0 50px #03e9f4, 0 0
		100px #03e9f4;
}

table {
	background: aqua;
	width: 600px;
}
</style>

</head>
<body>
<a href="index.jsp" ><input style="margin-left: 1000px;"  type="submit" value="Home"></a>
	
	
	<div class="container">
		<h1 align="center">
		
			<font><strong>Show All Empolyee Details</strong></font>
		</h1>
<form action="getall">
		<table border="1">
		
			<tr>

			</tr>
			<tr>
				<td><b>id</b></td>
				<td><b>Name</b></td>
				<td><b>LastName</b></td>
				<td><b>Mob_no</b></td>
				<td><b>Address</b></td>
				<td><b>Email_id</b></td>
				<td><b>Password</b></td>
			</tr>
			<c:forEach var="empData" items="${getall}">
			<tr>
				<td>${empData.id}</td>
				<td>${empData.name}</td>
				<td>${empData.lastname}</td>
				<td>${empData.mobno}</td>
				<td>${empData.emailid}</td>
				<td>${empData.address}</td>
				<td>${empData.password}</td>

			</tr>
</c:forEach>
		</table>
		</form>
	</div>
	

</body>
</html>