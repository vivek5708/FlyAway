<%@page import="com.controler.MainApp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.service.UserService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body>

<div style="margin: auto; width: 60%; padding: 10px;">
<h1>Please Provide The Passenger Information</h1>
<form method="post">
<table>
<tr>
<td>Flight ID:</td><td><input type="text" name="flight_id"></td>
</tr>
<tr>
<td>First Name:</td><td><input type="text" name="firstName"></td>
</tr>
<tr>
<td>Middle Name:</td><td><input type="text" name="middleName"></td>
</tr>
<tr>
<td>Last Name:</td><td><input type="text" name="lastName"></td>
</tr>
<tr>
<td>Mobile Number:</td><td><input type="text" name="mobNumber"></td>
</tr>
<tr>
<td>Email Id:</td><td><input type="text" name="email_id"></td>
</tr>
<tr>
<td></td><td><button type='submit' >submit</button></td>
</tr>
</table>
</form>
</div>
</body>
</html>