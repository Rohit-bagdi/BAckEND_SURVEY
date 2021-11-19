package in.cmss.survey.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@ToString
@Document(collection = "User")
public class UserModel {
	@Id
	private int id;
	private int user_id;
	private String user_name;
	private String user_password;
	private String user_type;
	private String user_email_id;
	private String user_contact;
	private Date user_create_on;
	private Date user_update_on;
}
