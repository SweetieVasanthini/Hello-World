package com.transunion.test.helloworld;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String greet(Map<String, Object> model) {
		model.put("greetings", "Heello World");
		return "Hello";
	}
}
