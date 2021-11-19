package in.cmss.survey;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import in.cmss.survey.model.Question;
import in.cmss.survey.repositories.QuestionsRepository;

@SpringBootApplication
@ComponentScan(basePackages= {"in.cmss.survey.controllers"})
public class SurveyApplication implements CommandLineRunner {

	@Autowired
	private QuestionsRepository questionsRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SurveyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		 
	}
	
	 @Bean
	 public FilterRegistrationBean corsFilter() {
	 UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	 CorsConfiguration config = new CorsConfiguration();
	 config.setAllowCredentials(true);
	 config.addAllowedOrigin("*");
	 config.addAllowedHeader("*");
	 config.addAllowedMethod("*");
	 source.registerCorsConfiguration("/**", config);
	 FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
	 bean.setOrder(0);
	 return bean;
	 }

}
