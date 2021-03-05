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
<h1>Ticket Confirmation</h1>
<h3>FlyAway.com</h3>
<h4>Hi,<%= session.getAttribute("fName") %> Your ticket is confirmed</h4>
Following are your Flight details
<h4>Flight Id: <%= session.getAttribute("flight_id_display") %> </h4>
<h4>Airline: <%= session.getAttribute("airline_display") %></h4>
<h4>Source: <%= session.getAttribute("from_city_display") %></h4>
<h4>Destination: <%= session.getAttribute("to_city_display") %></h4>
<h4>Price: <%= session.getAttribute("price_display") %> </h4>
<h4>Date of Travel: <%= session.getAttribute("date_display") %></h4>
</div>
</body>
</html>