package in.cmss.survey.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import in.cmss.survey.model.CustomerModel;

@Repository
public class CustomerfilterImpl implements Customer_Filter {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<CustomerModel> findCustomerByUSer(int user_id) {
		final Query query = new Query();
//		query.fields().include("_id").include("client_id").include("company_id");
		final List<Criteria> criteria = new ArrayList<>();
		if (user_id != 0)
			criteria.add(Criteria.where("user_id").is(user_id));

		if (!criteria.isEmpty())
			query.addCriteria(new Criteria().andOperator(criteria.toArray(new Criteria[criteria.size()])));
		return mongoTemplate.find(query, CustomerModel.class);
	}

}
