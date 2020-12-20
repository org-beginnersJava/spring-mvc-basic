package com.seleniumExpress.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		return "here is your sugar>>>>>";
	}

	

	@ResponseBody
	@RequestMapping("/makeup")
	public String giveMakeup() {
		return "here is your Makeupkit>>>>>";
	}

}
