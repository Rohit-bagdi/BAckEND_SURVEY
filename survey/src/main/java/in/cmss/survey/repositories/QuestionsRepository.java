package in.cmss.survey.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.cmss.survey.model.Question;
import in.cmss.survey.model.UserModel;

@Repository
public interface QuestionsRepository extends MongoRepository<Question,Integer> {
}
