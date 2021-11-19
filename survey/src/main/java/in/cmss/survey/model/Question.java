package in.cmss.survey.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Questions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

	@Id
	@JsonProperty(value = "_id")
	private int id;
	@JsonProperty(value = "question_id")
	private int question_id;
	@JsonProperty(value = "question_title")
	private String question_title;
	@JsonProperty(value = "question_type")
	private String question_type;
}
