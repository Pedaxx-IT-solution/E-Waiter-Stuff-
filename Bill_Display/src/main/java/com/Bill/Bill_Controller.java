package com.Bill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Bill_Controller {

	@Autowired
	private billdao billdao;

	@GetMapping("/getbill")
	public ModelAndView get() {

		ModelAndView mv = new ModelAndView();
		
		List<Order_details> li = billdao.readBill();
		mv.addObject("list", li);
		mv.setViewName("bill.jsp");
		return mv;

	}

}
