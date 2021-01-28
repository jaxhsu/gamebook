package org.jaxhsu.gamebook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/")
	String index() {
		return "Spring Boot - Spring Data JPA - H2 Web Console";
	}
	
}