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
<h1>Welcome to FlyAway</h1>
<h3>Please enter Your Travel details</h3>
<form method="post">
<table>
<tr>
<td>From(City):</td><td> <input type="text" name='from_city'></td>
</tr>
<tr>
<td>To(City):</td><td> <input type="text" name='to_city'></td>
</tr>
<tr>
<td>Date of Travel:</td><td> <input type="date" name='date_of_trav'></td>
</tr>
<tr>
<td>Number of passengers:</td><td> <input type="text" name='Num_of_passengers'></td>
</tr>
<tr>
<td><button type='submit' >submit</button></td>
</tr>
</table>
</form >
</div>
</body>

</html>