<%@page import="java.util.Iterator"%>
<%@page import="com.service.UserService"%>
<%@page import="com.model.Flights"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body>
<%@page import="java.util.ArrayList"%>
<% UserService us = new UserService(); %>
<div style="margin: auto; width: 60%; border: 5px solid #FFFF00; padding: 10px;">
<table style="border: 1px solid black;text-align:center;">
<tr><th>Flight Number</th><th>AirLine</th><th>From City</th><th>To City</th><th>Price</th><th>Date of travel</th></tr>
<%Iterator<Flights> iterator = us.getAllFlightDetails().iterator(); 
	while(iterator.hasNext()){
		Flights flightObj1 = iterator.next();%>
		<tr>
		<td><%out.println(flightObj1.getFlightID());%></td>
		<td><%out.println(flightObj1.getCompany()); %></td>
		<td><%out.println(flightObj1.getCity_from());  %></td>
		<td><%out.println(flightObj1.getCity_to()); %></td>
		<td><%out.println(flightObj1.getPrice()); %></td>
		<td><%out.println(flightObj1.getDate_of_travel()); %></td>
		</tr>
<%} %>
</table>
</div>
</body>
</html>