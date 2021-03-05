<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body>
<div style="margin: auto; width: 60%; padding: 10px;">
<h3>Amount: <%= session.getAttribute("price_display") %></h3>
<h1>Please Provide the Card Information</h1>
<form method="post">
<table>
<tr>
<td>Card Holder's Name:</td><td><input type="text" name="c_h_Name"></td>
</tr>
<tr>
<td>Card Number:</td><td><input type="text" name="cardNo"></td>
</tr>
<tr>
<td>CVV:</td><td><input type="text" name="cvv"></td>
</tr>
<tr>
<td>Expiration date:</td><td><input type="text" name="exDate"></td>
</tr>
<tr><td><a href="http://localhost:8090/mainapp/ticketconfirmation">Submit</a></td></tr>
</table>
</form>
</div>
</body>
</html>