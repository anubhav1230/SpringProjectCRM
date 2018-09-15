package com.code.springdemo.controller;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.springdemo.entity.Customer;
import com.code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject our customer service
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String showList(Model theModel) {

		// get the lsit of customer from service layer
		List<Customer> theCustomer = customerService.getCustomers();

		// add data to model and pass it to view.

		theModel.addAttribute("customers", theCustomer);

		return "list-customers";

	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Customer theCustomer = new Customer();

		// using this object give all the field value
		theModel.addAttribute("customer", theCustomer);

		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult,
			Model theModel) throws Exception {

		//getting the existing email
		boolean emailexists = doesEmailExist(theCustomer.getEmail());
		// save the customer using our service

		if (theBindingResult.hasErrors()) {

			return "customer-form";
		}

		else if (emailexists) {
			theModel.addAttribute("customer", new Customer());
			theModel.addAttribute("emailError", "Email already exists.");
			return "customer-form";
		}

		customerService.saveCustomer(theCustomer);

		return "redirect:/customer/list";

	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {

		// get the customer from our service
		Customer theCustomer = customerService.getCustomer(theId);

		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("customer", theCustomer);

		// send over to our form
		return "customer-form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {

		// delete the customer
		customerService.deleteCustomer(theId);

		return "redirect:/customer/list";
	}

	@PostMapping("/search")
	public String searchCustomers(@RequestParam("theSearchName") String theSearchName, Model theModel) {

		// search customers from the service
		List<Customer> theCustomers = customerService.searchCustomers(theSearchName);

		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);

		return "list-customers";
	}

	@GetMapping("/showList")
	public String deletesCustomer(@ModelAttribute("customer") int theId) {

		Customer theCustomer = new Customer();

		theCustomer.setId(theId);
		// delete the customer
		customerService.deleteCustomer(theId);

		return "redirect:/customer/list";
	}

	public boolean doesEmailExist(String string) {

		// check the database if the email already exists
		List<Customer> theCustomers = customerService.getCustomers();
		if (theCustomers != null && !theCustomers.isEmpty()) {
			for (Customer customers : theCustomers) {
				if (string.equals(customers.getEmail())) {

					return true;
				}

			}

		} 
		return false;
	}
}
