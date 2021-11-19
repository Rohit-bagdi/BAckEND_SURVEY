package in.cmss.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cmss.survey.model.CustomerModel;
import in.cmss.survey.repositories.CustomerRepository;

@Service
public class Customerservice {
	@Autowired
	private CustomerRepository customerRepository;

//	public List<CustomerModel> fetchCustomersByUSerid(int user_id) {
//		return customerRepository.findCustomerByUSer(user_id);
//
//	}

}