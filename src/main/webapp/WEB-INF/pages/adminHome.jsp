<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="margin: auto; width: 60%; padding: 10px;">
Welcome to admin home.
<br/>
As an Admin you can maintain a master list of All flights.
<p> Including the Source ,destination , The airline, Price of the Flight and Date of that Flight.</p>
<p>You can provide the input from following form</p>
<form method="post">
<table>
<tr>
<td>Flight Id:</td><td><input type="text" name="flight_id"></td>
</tr>
<tr>
<td>Airline:</td><td><input type="text" name="airline"></td>
</tr>
<tr>
<td>From City:</td><td><input type="text" name="from_city"></td>
</tr>
<tr>
<td>To City:</td><td><input type="text" name="to_city"></td>
</tr>
<tr>
<td>Price:</td><td> <input type="text" name="price"></td>
</tr>
<tr>
<td>Date of the Flight:</td><td><input type="date" name="date_of_trav"></td>
</tr>
<tr>
<td><button type='submit'>Submit</button></td>
</tr>
</table>
</form>
</div>
</body>
</html>