package in.cmss.survey.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cmss.survey.model.UserModel;
import in.cmss.survey.repositories.UserRepository;


@RestController
@RequestMapping("/Login")
public class Login {
	
	
	
 

		@Autowired
		private  UserRepository userRepository;

		@GetMapping(path="/{id}/{user_password}")
		public String Login(@PathVariable("id") int id,@PathVariable("user_password") String user_password){
			
		UserModel user= userRepository.findById(id);
		System.out.println(user);
		System.out.println(user_password);
		String passwordA = user.getUser_password();
	passwordA   = passwordA.trim();
	user_password =user_password.trim();
		System.out.println(passwordA);
		if(!passwordA.equals(user_password) )
		{
			return "login failed";
		}
		else {
			return "login sucess";
		}
//			 
		}

		 

}
