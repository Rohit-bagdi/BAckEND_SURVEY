package in.cmss.survey.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.cmss.survey.model.SurveyRelease;

public interface SurveyReleaseRepository extends MongoRepository<SurveyRelease, Integer> {

    
}