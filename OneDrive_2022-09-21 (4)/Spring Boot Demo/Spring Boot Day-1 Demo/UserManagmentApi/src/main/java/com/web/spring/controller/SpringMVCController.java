package com.web.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("emp")
public class SpringMVCController {
	//localhost:8082/emp/greet
	@RequestMapping(value = "/greet")
	public ModelAndView hello() {
		return new ModelAndView("greeting","msg","Spring MVC APP using Spring Boot");
		
	}

	
}
