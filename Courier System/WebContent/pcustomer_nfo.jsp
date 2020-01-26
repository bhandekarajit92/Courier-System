<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ship with Us</title>
<style type="text/css">
.form-style{
border:1px solid red;
width:500px;
height:auto;
background-color:yellow;
margin:20px;
}

</style>
</head>
<body>
	<div class="form-style" >
		<form action="Customer_info">
			First name:<br> <input type="text" name="pfname"> <br>
			Last Name: <br><input type="text" name="plname"> <br>
		
			Mobile:<br><input type="text" name="pmobile"> <br>
			Email:	<br><input type="text" name="pemail"> <br>
		House No:<br>	<input type="text" name="phouseno"> <br>
		Street:	<br><input type="text" name="pstreet"> <br>
		Land Mark:<br>		<input type="text" name="plandmark"> <br>
				City:<br><input type="text" name="pcity"> <br>
				Pin code:<br><input type="text" name="ppincode"> <br>
				<br>
				Catagory: <select name="catagory">
				
				<option value="document">Document</option>
				
				<option value="parcel">Parcel</option>
				</select>
				<br>
				delivery: <select name="deliveryoption">
				
				<option value="fast">fast</option>
				
				<option value="normal">normal</option>
				</select>
				
				<br>
				
				<input type="submit" value="Submit">
				

		</form>
	</div>
</body>
</html>