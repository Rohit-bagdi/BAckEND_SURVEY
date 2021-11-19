package in.cmss.survey.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cmss.survey.model.Question;
import in.cmss.survey.model.SurveyBuilder;
import in.cmss.survey.repositories.SurveyRepository;
import in.cmss.survey.repositories.SurveyRepositoryImpl;

@RestController
@RequestMapping("/Survey")
public class SurveyController {

	 
	@Autowired
	private SurveyRepository surveyRepository;
	@Autowired
	private  SurveyRepositoryImpl surveyRepositoryImpl;

	@GetMapping(value = "/questions/all")
	public List<SurveyBuilder> getAllUsers() {

		List<SurveyBuilder> Surveylist = surveyRepository.findAll();
		for (SurveyBuilder surveyBuilder : Surveylist) {
			System.out.println(surveyBuilder.toString());
		}
		return Surveylist;
	}

	@GetMapping(value = "/questions/{id}")
	public Optional<SurveyBuilder> findUser(@PathVariable int id) {

		Optional<SurveyBuilder> questions = surveyRepository.findById(id);

		return questions;
	}

	@PostMapping(value = "/generate", consumes = MediaType.APPLICATION_JSON_VALUE)
	public SurveyBuilder saveUser(@RequestBody SurveyBuilder survey) {
		survey.setSurvey_create_on(new Date());
		survey.setSurvey_update_on(new Date());
		int[] intArray = new int[]{ 10,20,30 }; 
		   
		survey.setQuestionsid(intArray);
		surveyRepository.save(survey);

		return survey;
	}

	/*
	 * @PutMapping(value = "/question") public Map<String, Object>
	 * updateSurvey(@RequestBody SurveyBuilder survey) { SurveyBuilder updatedSurvey
	 * = surveyRepository.save(survey); Map<String, Object> responseMap = new
	 * HashMap<>();
	 * 
	 * responseMap.put("survey", updatedSurvey); responseMap.put("status", 200);
	 * responseMap.put("message", "Success"); return responseMap; }
	 */

	@DeleteMapping(value = "/question/{id}")
	public String deleteSurvey(@PathVariable int id) {

		surveyRepository.deleteById(id);

		return "deleted";
	}

	@GetMapping(value="/getAll/Questions/{id}")
	public  List<Optional<Question>> getAllQuestionsFromArray(@PathVariable int id)
	{    System.out.println(id);
		 Optional<SurveyBuilder> Survey = surveyRepository.findById(id);
		System.out.println(Survey);
		SurveyBuilder surveys= Survey.get();
		System.out.println(surveys);
		int[] Questionid = surveys.getQuestionsid();
		return  surveyRepositoryImpl.getQuestionbyId(Questionid) ;
		
	}
	 
	
}
