package in.cmss.survey.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.cmss.survey.model.Answers;

public interface AnswerRepository extends MongoRepository<Answers, Integer> {

  
	
}
