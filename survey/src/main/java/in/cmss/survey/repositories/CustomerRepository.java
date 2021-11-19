package in.cmss.survey.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import in.cmss.survey.model.CustomerModel;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerModel, Integer> {

	public Optional<CustomerModel> findById(int id);

	public void deleteById(int id);
	
	@Query("{user_id:?0}")
	List<CustomerModel> findByUserId(String userId);

}
