package com.seleniumExpress.cafeControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomePageController {

	@RequestMapping("/welcome")
	public String myWelcomePage(Model model) {
		System.out.println("Welcome-Page Controller>>>>>>>");
		String name = "Richi Jitendra Patidar";
		model.addAttribute("myNameValue",name);
		model.addAttribute("myWelcomePage", "MOM's CAFE");
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(Model model) {
		System.out.println("Welcome-Page Controller>>>>>>>");
		String name = "Your Order is received!!";
		model.addAttribute("myOrderValue",name);
		return "process-order";
	}
}
