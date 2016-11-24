package org.learn.ecom.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping(value="/")
	public String showMeHome(){
		System.out.println("Controller is heyah");
		return "home";
	}

	@RequestMapping(value = "/denied")
	public String kickEmOut(){
		return "accessDenied";
	}
}
