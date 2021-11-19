package in.cmss.survey.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.cmss.survey.model.Question;
import in.cmss.survey.model.SurveyBuilder;

@Repository
public interface SurveyRepository extends MongoRepository<SurveyBuilder, Integer> {

}