package com.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

	@RequestMapping("/Menu")
	public ModelAndView testpage() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("Menu.jsp");
		return mv;

	}
	
	
	@RequestMapping("/cart")
	public ModelAndView testpage1() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("cart.jsp");
		return mv;

	}
	
	
	

}
