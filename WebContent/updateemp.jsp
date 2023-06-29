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

form {
	background : #E0E8F0;
}


</style>
</head>


<body>

   <center> <h1 style="color: Red;">${error}</h1></center>
 <center>	<h1 style="color: Green;" >${SuccessMsg}</h1></center>
 
 <a href="index.jsp" ><input style="margin-left: 1300px;"  type="submit" value="Home"></a>
	<center>
	
		<form action="update"
			style=" text-align: center; padding-bottom: 20px; width: 500px;">
			
				<fieldset>
				<legend>	<h1>Update Employee Detail</h1> </legend>
			
				<hr>
			<b>	<label> Id: </label> <input type="text" name="id"
					placeholder="Enter Id" /> <br> <br> 
				
				<label> Firstname: </label> <input type="text" name="name"
					placeholder="Firstname" size="15" /> <br> <br> <label>
					Lastname: </label> <input type="text" name="lastname"
					placeholder="Lastname" size="15" /> <br> <br>
				

					Mobno : </label> <input type="text" placeholder="Country Code" value="+91"
						size="2" /> <input type="text" name="mobno"
						placeholder="phone no." size="10"/ > <br> <br>

					Address : <input type="text" placeholder="Enter Address"
						name="address"> <br> <br> <label>Email:
					</label> <input type="text" placeholder="Enter Email" name="emailid">
					<br> <br> <label>Password: </label> <input
					name="password"	type="password" placeholder="Enter Password" >
					<br> <br>
					
					<input type="submit" style=" font-size: 20px; color: green; margin-top: 50px;">
					</fieldset>
				
		</form>
	</center>
	 
</body>
</html>