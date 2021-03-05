package com.controler;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Flights;
import com.service.UserService;

@Controller
@RequestMapping("/mainapp")
public class MainApp {
	
	
	@Autowired(required=true)
	private UserService service;
	
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String sayWelcome() {
		return "welcome";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginValid(@RequestParam("uname") String name,@RequestParam("pass") String pass) {
		if(service.loginValidate(name, pass)) {
			return "adminLoginHome";
		}
		return "login is invalid";
	}
	
	@RequestMapping(value="/adminHome", method = RequestMethod.GET)
	public String adminHome() {
			return "adminHome";
	}
	
	@RequestMapping(value="/adminHome", method=RequestMethod.POST)
	public String adminAddFlight(@RequestParam("flight_id") String flightId,@RequestParam("airline") String airLine,@RequestParam("from_city") String fromCity, 
			@RequestParam("to_city") String toCity, @RequestParam("price") String price, @RequestParam("date_of_trav") String dateOfTravel) {
		try {
			service.adminAddFlight(flightId, airLine, fromCity, toCity, price, dateOfTravel);
		}
		catch (Exception e) {
			// TODO: handle exception
			return "flightAddFailure";
		}
		return "flightAddSuccess";
	}
	
	@RequestMapping(value="/changePassword", method = RequestMethod.GET)
	public String changePassword() {
		return "changePassword";
	}
	
	@RequestMapping(value="/changePassword", method = RequestMethod.POST)
	public String adminPasswdChange(@RequestParam("old_pass") String oldPassword,
			@RequestParam("new_pass") String newPassword,@RequestParam("conf_new_pass") String confNewPassword)
	{
		if(service.adminPasswordChange(oldPassword, newPassword, confNewPassword)) {
			return "adminPasswordChangeSuccess";
		}
		else {
			return "adminPasswordChangeFail";
		}
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String registration() {
		return "registration";
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public String registrationSuccess(@RequestParam("from_city") String from_city,@RequestParam("to_city") String to_city,@RequestParam("date_of_trav") String date_of_trav,@RequestParam("Num_of_passengers") String num_of_passengers) {
		service.searchFlight(from_city, to_city, date_of_trav, num_of_passengers);
		return "searchFlightResult";
		
	}
	
	
	@RequestMapping(value="/passengerInfo", method = RequestMethod.GET)
	public String  getPassengerInfo() {
		return "passengerInfo";
	}

	@RequestMapping(value="/passengerInfo", method = RequestMethod.POST)
	public String  putPassengerInfo(HttpServletRequest request,@RequestParam("flight_id") String flightId,@RequestParam("firstName") String first_name,@RequestParam("middleName") String middle_name,@RequestParam("lastName") String last_name,@RequestParam("mobNumber") String mobile_number,@RequestParam("email_id") String email_id) {
		HttpSession session = request.getSession();
		session.setAttribute("fName", request.getParameter("firstName"));
		session.setAttribute("mName", request.getParameter("middleName"));
		session.setAttribute("lName", request.getParameter("lastName"));
		session.setAttribute("mobNo", request.getParameter("mobNumber"));
		session.setAttribute("emailId", request.getParameter("email_id"));
		Flights  f1 = service.getFlightObject(flightId);
		session.setAttribute("flight_id_display", f1.getFlightID());
		session.setAttribute("airline_display", f1.getCompany());
		session.setAttribute("from_city_display", f1.getCity_from());
		session.setAttribute("to_city_display", f1.getCity_to());
		session.setAttribute("price_display", f1.getPrice());
		session.setAttribute("date_display", f1.getDate_of_travel());
		service.putPassengersInfo(first_name, middle_name, last_name, mobile_number, email_id);
		return "bookingReview";
	}
	
	@RequestMapping(value="/paymentInfo", method = RequestMethod.GET)
	public String  getPaymentInfo() {
		return "paymentInfo";
	}
	
	@RequestMapping(value="/ticketconfirmation", method = RequestMethod.GET)
	public String  getTicketConfirmation() {
		return "ticketConfirmation";
	}
	
	@RequestMapping(value="/adminViewAllFlights", method = RequestMethod.GET)
	public String adminViewAllFlights() {
		return "adminViewAllFlight";
	}
	
}
