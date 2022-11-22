package com.rajnish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	
	@GetMapping("/wish")
	public ModelAndView getHome() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "All the best ...!");
		mv.setViewName("best");
		return mv;
	}
	
}
