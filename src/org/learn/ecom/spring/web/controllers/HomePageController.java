package org.learn.ecom.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping(value="/")
	public String showMeHome(){
		return "home";
	}
}
