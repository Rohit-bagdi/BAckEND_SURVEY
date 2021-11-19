package in.cmss.survey.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.cmss.survey.model.Answers;
import in.cmss.survey.repositories.AnswerRepository;

@RestController
@RequestMapping("/Answers")
public class AnswerController {

	@Autowired
	private AnswerRepository AnswerRepository;

	@PostMapping(path="/save", headers = "Accept=application/json")
	public Answers Addtodatabase(@RequestBody Answers answerString){
	System.out.println(answerString);
//		System.out.println(answer);
//		AnswerRepository.save(answer);
		ModelMapper modelMapper = new ModelMapper();
		// user here is a prepopulated User instance
		Answers  userDTO = modelMapper.map(answerString, Answers.class);
		try {
			//System.out.println(answerString);
			//ObjectMapper mapper = new ObjectMapper();
//			answers= mapper.readValue(answerString, Answers.class);
			AnswerRepository.save(userDTO);
			//System.out.println(userDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return  userDTO;

	}

	@GetMapping("/view")
	public List<Answers> view() {
		List<Answers> Answers = AnswerRepository.findAll();

		return Answers;

	}

}
