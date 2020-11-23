package com.mx.mejia.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coach;
	
	@Value("${coach.team}")
	private String team;

	@GetMapping("/")
	public String sayHello() {
		return "Hello Wordl! Time on server is : " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String workout() {
		return "Run hard 5K!....";
	}
	
	@GetMapping("/infoTeam")
	public String teamInfo() {
		
		return "Coach: " + coach + ", Team: " + team;
	}

}
