package in.cmss.survey.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.cmss.survey.model.Question;
import in.cmss.survey.model.SurveyBuilder;

@Service
public class SurveyRepositoryImpl {

	@Autowired
	private QuestionsRepository questionsRepository;

	public List<Optional<Question>> getQuestionbyId(int[] QidList) {
		List<Optional<Question>> questionList = new ArrayList<Optional<Question>>();

		for (Integer qId : QidList) {
			System.out.println(qId);
			Optional<Question> Question= questionsRepository.findById(qId);
		questionList.add(Question);
		 
			//			questionList.add(questionsRepository.findById(qId));
		}
		return questionList;
	}

}