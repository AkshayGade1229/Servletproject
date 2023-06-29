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
	background: #FFF8D0;
}
fieldset{
padding:20px;
height:480px;

}


</style>

</head>


<body>
	 <center> <h1 style="color: Red;">${error}</h1></center>
 <center>	<h1 style="color: Green;" >${SuccessMsg}</h1></center>
 <hr>
 <a href="index.jsp" ><input style="margin-left: 1300px; color: #FF4000;"  type="submit" value="Home"></a>
	<center>
		<form action="add"
			style=" text-align: center; padding-bottom: 20px; width: 500px; height:500px;">
				
				
			<fieldset>
			
					<legend><h1>Add Employee </h1></legend>
				
				
				<b><label> Firstname : </label></b> 
				<input type="text" name="name"
					placeholder="Firstname" size="15" /> <br> <br>
					
					<b> <label>Lastname: </label> <input type="text" name="lastname"
					placeholder="Lastname" size="15" /> <br> <br>
			     

				Mobno: </label> <input type="text" placeholder="Country Code" value="+91"
					size="2" /> <input type="text" name="mobno"
					placeholder="phone no." size="10"/ > <br> <br>

				Address : <input type="text" placeholder="Enter Address"
					name="Address"> <br> <br>
					 <label>Email :</label> 
					 <input type="text" placeholder="Enter Email" name="email"><br> <br> 
					 <label>Password : </label>
					  <input name="pass" type="password" placeholder="Enter Password" ><br> <br><br> <br>
					  
			       <input type="submit" style=" font-size: 20px; color: green;">
			    
			    
			    
			    </fieldset>
			      
			       
			       
		</form>
		
	</center>
	
           
</body>
</html>