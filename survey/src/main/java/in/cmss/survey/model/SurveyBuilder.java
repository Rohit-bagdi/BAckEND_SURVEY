package in.cmss.survey.model;


	
	
	import lombok.Data;
import lombok.Getter;
	import lombok.Setter;
	import lombok.ToString;
	import org.springframework.data.annotation.Id;
	import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

	 @Data
	 @Getter
	 @Setter
	 @ToString
	@Document(collection = "SurveyBuilder")
	public class SurveyBuilder {
	    @Id   
	    @JsonProperty(value = "_id")
	    private int id;   
	    @JsonProperty(value = "survey_id")
	    private int survey_id;
	    @JsonProperty(value = "survey_description")
	    private String survey_description;
	    private Date survey_create_on;
	    private Date survey_update_on;
	    @JsonProperty(value = "questions")
	    private int[] questionsid;
	    @JsonProperty(value = "user_id")
	    private int user_id;
	   


	 

}
