package com.fightclub.FinalProject5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalProject4Application {

	public static void main(String[] args) {
		SpringApplication.run(FinalProject4Application.class, args);
	}
//	to access swagger console use http://localhost:8080/swagger-ui.html
	
//	use http://localhost:8080/h2-console/ to access h2 console
//	saved settings: generic h2 (embedded)
//	setting name:  generic h2 (embedded)
//	driver class: org.h2.Driver
//	jdbc url: jdbc:h2:./dbstorage/demodb
//	username: sa
//	password: password
	
//	THIS DOESNT WORK/DONT USE
//	localhost:8080/api/whatever to access api end (in controller files) 
//	localhost:8080/whatever to access html pages (in src/main/resources/templates)
//	so use http://localhost:8080/home to access home page and stuff
		
	
	
}
