<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

body {
	background: #F0E0F0;
}

</style>
</head>

<body>
      <center> <h1 style="color: Red;">${error}</h1></center>
 <center>	<h1 style="color: Green;" >${SuccessMsg}</h1></center>
 
 <a href="index.jsp" ><input style="margin-left: 1300px;"  type="submit" value="Home"></a>
 
<center>
<h1>Delete Employee</h1>
<form action="delete">
	<label> Id :  </label>   
	<input type="text" name="id" placeholder= " Enter id"   /><br> <br>
	
	<input type="Submit" value="Delete" name="Delete">
	</form>
	</center>
	
</body>
</html>