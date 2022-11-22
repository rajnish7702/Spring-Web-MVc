package com.rajnish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FistController {
	
	@GetMapping("/welcome")
	public ModelAndView getMessage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Welcome to Myside");
		mv.setViewName("index");
		return mv;
	}
	@GetMapping("/morning")
	public ModelAndView getMorning() {
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("mor", "Good Morning ..!");
		mv.setViewName("view");
		return mv;
	}
}
