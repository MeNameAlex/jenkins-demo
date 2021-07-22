package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemo {

	@GetMapping(path="/hello")
	public String getGreeting(){
		return "Hello World!";
	}
}
