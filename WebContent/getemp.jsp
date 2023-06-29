<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
table {
     background: aqua;
	margin-top: 50px;
}

body {
	background: #F0E0F0;
}
</style>

</head>
<body>
<a href="index.jsp" ><input style="margin-left: 1000px;"  type="submit" value="Home"></a>
<center>
<form action="get" method="get">
<label>Enter Your Id </label><br><br>
<input type="text" name="id"><br><br>
<input type="Submit" value="Show">
</center>



	<center> <table border=1>
		<tr>
			<th>Id</th>
			<th> Name</th>
			<th>Last Name</th>
			<th>Mob_No</th>
			<th>Email_id</th>
			<th>Address</th>
			<th>Password</th>
		</tr>
		<tr>
			<td>${empData.id}</td>
			<td>${empData.name}</td>
			<td>${empData.lastname}</td>
			<td>${empData.mobno}</td>
			<td>${empData.emailid}</td>
			<td>${empData.address}</td>
			<td>${empData.password}</td>
			
		</tr>
		
		
	</table>
	</center>


</form>

 
</body>
</html>