package in.cmss.survey.repositories;

import java.util.List;

import in.cmss.survey.model.CustomerModel;

public interface Customer_Filter {

	public List<CustomerModel> findCustomerByUSer(int user_id);

}
