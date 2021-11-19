package in.cmss.survey.model;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Answers {
	
	@Id
	@JsonProperty(value="answerid")
	private int answerid;
	@JsonProperty(value="answervalue")
	private String answer;
	
//	public Answers() {
//		super();
//		// TODO Auto-generated constructor stub
//	}



	@Override
	public String toString() {
		return "Answers [Answerid=" + answerid + ", Answer=" + answer + "]";
	}



	public Answers(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	
	
	
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
