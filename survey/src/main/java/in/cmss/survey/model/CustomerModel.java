package in.cmss.survey.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Customer")
public class CustomerModel {
	
	@Id
	@JsonProperty(value = "_id")
	private int id;
	@JsonProperty(value = "client_id")
	private int client_id;
	@JsonProperty(value = "company_id")
    private int company_id;
	@JsonProperty(value = "company_name")
    private String company_name;
	@JsonProperty(value = "company_description")
    private String company_description;
	@JsonProperty(value = "client_name")
    private String client_name;
	@JsonProperty(value = "client_type")
    private String client_type;
	@JsonProperty(value = "client_email_id")
    private String client_email_id;
	@JsonProperty(value = "client_contact")
    private long client_contact;
    @JsonProperty(value = "user_id")
    private int user_id;
    private Date client_create_on;
    private Date client_update_on;
	 

}
