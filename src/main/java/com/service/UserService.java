package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.model.Flights;

@Service
public class UserService {

	public static  ArrayList<Flights> list2 = new ArrayList<Flights>();
	
	static String uName="vivek";
	static String passwd = "manager";
		
	public ArrayList<Flights> searchFlight(String from_city,String to_city,String date_of_trav, String num_of_passengers) {
		Connection conn = null;
	
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","");

			PreparedStatement pst = conn.prepareStatement("select * from flights where city_from=? and city_to=? and date_of_travel=?");

			pst.setString(1, from_city);
			pst.setString(2, to_city);
			pst.setString(3, date_of_trav);

			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				String flightId = rs.getString("flight_id");
				String company = rs.getString("company");
				String city_from = rs.getString("city_from");
				String city_to = rs.getString("city_to");
				int price = rs.getInt("price");
				String date_of_travel = rs.getString("date_of_travel");

				Flights rObj = new Flights(flightId,company, city_from, city_to, price, date_of_travel);
				list2.add(rObj);
			}

		}
		catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();

		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}
		return list2;
	}
	
	public void putPassengersInfo(String firstName,String middleName, String lastName, String mobileNumber, String email_id) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","");

			PreparedStatement pst = conn.prepareStatement("insert into passengers(first_name, middle_name, last_name, mobile_number, email_id) values(?,?,?,?,?)");

			pst.setString(1, firstName);
			pst.setString(2, middleName);
			pst.setString(3, lastName);
			pst.setString(4, mobileNumber);
			pst.setString(5, email_id);

			pst.executeUpdate();

		}
		catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();

		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}
	}
	
	public boolean loginValidate(String userName, String password) {
		if(userName.equals(uName) && password.equals(passwd)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void adminAddFlight(String flightId, String airline,String fromCity,String toCity,String price,String dateOfTravel) {
		Connection conn = null;
		
		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","");

			PreparedStatement pst = conn.prepareStatement("insert into flights(flight_id,company,city_from,city_to,price,date_of_travel) values(?,?,?,?,?,?)");

			pst.setString(1, flightId);
			pst.setString(2, airline);
			pst.setString(3, fromCity);
			pst.setString(4, toCity);
			pst.setString(5, price);
			pst.setString(6, dateOfTravel);

			pst.executeUpdate();

		}
		catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();

		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}
	}
	
	public boolean adminPasswordChange(String oldPassword, String newPassword, String confNewPassword) {
		if(oldPassword.equals(passwd) && newPassword.equals(confNewPassword))
		{
			passwd = newPassword;
			return true;
		}
		else {
			return false;
		}
	}
	
	public ArrayList<Flights> getAllFlightDetails(){
		Connection conn = null;
		Statement stmt = null;
		ArrayList<Flights> flightList = new ArrayList<Flights>();
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","");

			stmt = conn.createStatement();

			String sql = "SELECT * FROM flights";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String flightId =  rs.getString("flight_id");
				String company = rs.getString("company");
				String fromCity = rs.getString("city_from");
				String toCity = rs.getString("city_to");
				int price = rs.getInt("price");
				String date_of_travel = rs.getString("date_of_travel");

				Flights rObj = new Flights(flightId,company, fromCity, toCity, price, date_of_travel);
				flightList.add(rObj);
			}
		}
		catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					conn.close();
			}catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}
		
		return flightList;
	}
	
	public Flights getFlightObject(String flightID) {
		Flights f1 = new Flights();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","");

			PreparedStatement pst = conn.prepareStatement("select * from flights where flight_id=?");

			pst.setString(1, flightID);
	
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				String flightId = rs.getString("flight_id");
				String company = rs.getString("company");
				String city_from = rs.getString("city_from");
				String city_to = rs.getString("city_to");
				int price = rs.getInt("price");
				String date_of_travel = rs.getString("date_of_travel");

				f1 = new Flights(flightId,company, city_from, city_to, price, date_of_travel);
			}

		}
		catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();

		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}
		return f1;
	}
}
