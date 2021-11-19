package in.cmss.survey.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.cmss.survey.model.CustomerModel;
import in.cmss.survey.repositories.CustomerRepository;
import in.cmss.survey.service.Customerservice;

@RestController
@RequestMapping("/filter")
public class FilterRespo {

//	@Autowired
//	private Customerservice customer;

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping(value = "/abc")
	public String getStudentsByProperties(@RequestParam(required = true, name = "userId") int user_id) {
		System.out.println("Welcome home");
//		List<CustomerModel> customerModels = customer.fetchCustomersByUSerid(user_id);
		List<CustomerModel> customerModels = customerRepository.findByUserId(String.valueOf(user_id));
		String resString = "";
		for (CustomerModel customerModel : customerModels) {
			resString += customerModel.toString();
			System.out.println(customerModel.toString());
		}

		return resString;
//		return ResponseEntity.ok().body(customer.fetchCustomersByUSerid(user_id));

	}
}