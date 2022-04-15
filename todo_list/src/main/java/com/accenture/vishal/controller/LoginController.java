package com.accenture.vishal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	
	@RequestMapping("/2")
	public ModelAndView begin() {
		System.out.println("requ is made");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("2");
		return modelAndView;
	}
	

}
