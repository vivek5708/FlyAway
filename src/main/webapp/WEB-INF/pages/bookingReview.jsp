<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="margin: auto; width: 60%;  padding: 10px;">
<h3>Please Review the Following Ticket that you Have selected to book-</h3>
<h4>Flight Id: <%= session.getAttribute("flight_id_display") %> </h4>
<h4>Airline: <%= session.getAttribute("airline_display") %></h4>
<h4>Source: <%= session.getAttribute("from_city_display") %></h4>
<h4>Destination: <%= session.getAttribute("to_city_display") %></h4>
<h4>Price: <%= session.getAttribute("price_display") %> </h4>
<h4>Date of Travel: <%= session.getAttribute("date_display") %></h4>
<h4>Passenger's first Name: <%= session.getAttribute("fName") %> </h4>
<h4>Passenger's middle Name: <%= session.getAttribute("mName") %> </h4>
<h4>Passenger's last Name: <%= session.getAttribute("lName") %> </h4>
<h4>Mobile number: <%= session.getAttribute("mobNo") %> </h4>
<h4>Email Id: <%= session.getAttribute("emailId") %> </h4>
<a href="http://localhost:8090/mainapp/paymentInfo">Proceed to payment</a>
</div>
</body>
</html>