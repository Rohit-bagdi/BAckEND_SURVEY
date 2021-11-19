package in.cmss.survey.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cmss.survey.model.CustomerModel;
import in.cmss.survey.repositories.CustomerRepository;


	
	
	@RestController
	@RequestMapping("/Customer")
	public class Customercontroller {

		@Autowired
		private  CustomerRepository customerrepository;

		@PostMapping("/save")
		public String Addtodatabase(@RequestBody CustomerModel customer) {
			
			customer.setClient_create_on(new Date());
			customer.setClient_update_on(new Date());
			customerrepository.save(customer);
			System.out.println(customer);
			return "dokneey";

		}

		@DeleteMapping("/remove/{id}")
		public String deletefromdatabase(@PathVariable Integer id) {

			customerrepository.deleteById(id);
			return "done";

		}

		/*@PostMapping("/update")
		public String updatetodatabase(@RequestBody UserModel user) {
			UserModel userupdated = new UserModel();

			if (useRepository.existsById(user.getId())) {
				if (user.getUser_name() != "null") {
					userupdated.setUser_name(user.getUser_name());
				}
				if (user.getUser_password() != "null") {
					userupdated.setUser_password(user.getUser_password());
				}

				if (user.getUser_type() != "null") {
					userupdated.setUser_type(user.getUser_type());
				}
				if (user.getUser_email_id() != "null") {
					userupdated.setUser_email_id(user.getUser_email_id());
				}
				if (user.getUser_contact() != "null") {
					userupdated.setUser_contact(user.getUser_contact());
				}

				userupdated.setUser_update_on(new Date());

				useRepository.save(userupdated);

			}

			return "updated";

		}*/
		
		
		
		
		@GetMapping("/view/{id}")
		public Optional<CustomerModel> view(@PathVariable int id)
		{
			Optional<CustomerModel> customer = customerrepository.findById(id); 
		
			return customer;
			
		}
		
		@GetMapping("/view/All")
		public List<CustomerModel> viewAll()
		{
			 List<CustomerModel>  Customers = customerrepository.findAll(); 
		
			return Customers;
			
		}
		

	}



