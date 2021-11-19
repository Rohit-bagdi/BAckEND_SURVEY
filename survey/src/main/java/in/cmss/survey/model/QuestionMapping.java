package in.cmss.survey.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class QuestionMapping {
 @JsonProperty("Qid")
	private int Qid; 
}
