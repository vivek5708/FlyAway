package com.model;

public class Flights {
	
	private String flightID;
	private String company;
	private String city_from;
	private String city_to;
	private int price;
	private String date_of_travel;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCity_from() {
		return city_from;
	}
	public void setCity_from(String city_from) {
		this.city_from = city_from;
	}
	public String getCity_to() {
		return city_to;
	}
	public void setCity_to(String city_to) {
		this.city_to = city_to;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate_of_travel() {
		return date_of_travel;
	}
	public void setDate_of_travel(String date_of_travel) {
		this.date_of_travel = date_of_travel;
	}
	public Flights(String flightID, String company, String city_from, String city_to, int price,
			String date_of_travel) {
		super();
		this.flightID = flightID;
		this.company = company;
		this.city_from = city_from;
		this.city_to = city_to;
		this.price = price;
		this.date_of_travel = date_of_travel;
	}
	public String getFlightID() {
		return flightID;
	}
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	public Flights() {
		super();
		// TODO Auto-generated constructor stub
	}
}
