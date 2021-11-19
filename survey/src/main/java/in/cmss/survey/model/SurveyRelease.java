package in.cmss.survey.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Getter@Setter@ToString
@Document(collection = "SurveyRelease")
public class SurveyRelease {
  
	private int share_survey_id; 
	 
    private int user_id; 
    private int client_id;
    private String client_email_id;
    private String user_email_id;
    private Date share_survey_release_on;
    private Date share_survey_schedule_on;
	
}
