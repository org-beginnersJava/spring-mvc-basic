package com.seleniumExpress.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BrotherController {
	
	@RequestMapping("/cricketBat")
	public String giveCricket() {
		System.out.println("Cricket Bat Controller>>>>>>>>>>");
		return "MRFCricketBat";
	}

}
