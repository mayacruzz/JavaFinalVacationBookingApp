package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import main.model.Trip;
import main.repository.TravelRepository;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Apr 3, 2024
 */
@Controller
public class WebController {
	@Autowired
	TravelRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllBookings(Model model) {
		return null;
	}
	
	@GetMapping("/inputBooking")
	public String addNewBooking(Model model) {
		return null;
	}
	
	@PostMapping("/inputBooking")
	public String addNewBooking(@ModelAttribute Trip trip, Model model) {
		return null;
	}
	
	@GetMapping("/editDestination{id}")
	public String showUpdateDestination(@PathVariable("id") long id, Model model) {
		return null;
	}
	@GetMapping("/editLodging{id}")
	public String showUpdateLodging(@PathVariable("id") long id, Model model) {
		return null;
	}
	
	@GetMapping("/editRental{id}")
	public String showUpdateRental(@PathVariable("id") long id, Model model) {
		return null;
	}
	
	@PostMapping("/update/{id}")
	public String reviseBooking(Trip trip, Model model) {
		return null;
	}
	
	@GetMapping("/delete/{id}")
	public String deleteTrip(@PathVariable("id") long id, Model model) {
		return null;
	}
	
}