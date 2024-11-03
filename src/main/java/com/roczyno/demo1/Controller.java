package com.roczyno.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping
	public String hello(){
		return "hello from ecs fargate";
	}
}
