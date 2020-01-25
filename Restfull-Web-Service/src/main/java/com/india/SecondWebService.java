package com.india;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondWebService {
	
	
	@RequestMapping("/sec")
	public String lecce()
	{
		return "scond contoller ";
	}
	
	
	

}
