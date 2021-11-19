package in.cmss.survey.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.cmss.survey.model.Answers;
import in.cmss.survey.model.Question;
import in.cmss.survey.model.SurveyBuilder;
import in.cmss.survey.repositories.QuestionsRepository;

@RestController
@RequestMapping("/Question")

public class QuestionController {

	@Autowired
	private QuestionsRepository QuestionRepository;

	@PostMapping(path = "/save", headers = "Accept=application/json")
	public Question addToDB(@RequestBody Question inputQuestion) {
		System.out.println(inputQuestion);
		try {
			QuestionRepository.save(inputQuestion);
			//ModelMapper modelMapper = new ModelMapper();
			// user here is a prepopulated User instance
			//SurveyBuilder  userDTO = modelMapper.map(inputQuestion,SurveyBuilder.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return inputQuestion;
	}

	@PostMapping("/view")
	public List<Question> view() {
		List<Question> Answers = QuestionRepository.findAll();

		return Answers;

	}
	
	@GetMapping("/{id}")
	public Question viewQuestion(@PathVariable int id)
	{
		return  QuestionRepository.findById(id).get();
		
	}
	
	
	@PostMapping("/{id}")
	public Question  edit(@PathVariable int id)
	{
		
		 
		Question questions1= QuestionRepository.findById(id).get();
		 
questions1.setQuestion_title("hi how are you");
QuestionRepository.save(questions1);
System.out.println(questions1);
		return questions1;
		
	}

}
