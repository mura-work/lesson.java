package jp.co.sss.lesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {
	@GetMapping("/login")
	public String login() {
		return "session/login";
	}
	
	@GetMapping("/doLogin")
	public String doLogin(String userId) {
		System.out.println(userId);
		return "session/login";
	}
}
