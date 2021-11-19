package in.cmss.survey.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cmss.survey.model.SurveyBuilder;
import in.cmss.survey.model.UserModel;
import in.cmss.survey.repositories.UserRepository;

@RestController
@RequestMapping("/Save")
@CrossOrigin(origins = { "*"})
public class UsertoDatabase {

	@Autowired
	private UserRepository useRepository;

	@PostMapping("/all")
	
	public String Addtodatabase(@RequestBody UserModel user) {
		
		user.setUser_create_on(new Date());
		user.setUser_update_on(new Date());
		useRepository.save(user);
		System.out.println(user);
		return "dokneey";

	}

	@DeleteMapping("/remove/{id}")
	public String deletefromdatabase(@PathVariable Integer id) {

		useRepository.deleteById(id);
		return "done";

	}

	/*@PostMapping("/update")
	public String updatetodatabase(@RequestBody UserModel user) {
		UserModel userupdated = new UserModel();

		if (useRepository.existsById(user.getId())) {
			if (user.getUser_name() != "null") {
				userupdated.setUser_name(user.getUser_name());
			}
			if (user.getUser_password() != "null") {
				userupdated.setUser_password(user.getUser_password());
			}

			if (user.getUser_type() != "null") {
				userupdated.setUser_type(user.getUser_type());
			}
			if (user.getUser_email_id() != "null") {
				userupdated.setUser_email_id(user.getUser_email_id());
			}
			if (user.getUser_contact() != "null") {
				userupdated.setUser_contact(user.getUser_contact());
			}

			userupdated.setUser_update_on(new Date());

			useRepository.save(userupdated);

		}

		return "updated";

	}*/
	
	
	
	
	@PostMapping("/view/{id}")
	public  UserModel view(@PathVariable int id)
	{
		UserModel user = useRepository.findById(id); 
	
		return user;
		
	}
	
	
	
	@GetMapping(value = "/view/All")
	public List<UserModel> getAllUsers() {

		List<UserModel> User = useRepository.findAll();

		return  User;
	}

}
