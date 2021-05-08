package jp.co.sss.lesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.sss.lesson.form.LoginForm;

@Controller
public class SessionController {
	@GetMapping("/login")
	public String login() {
		return "session/login";
	}
	
	@PostMapping("/postLogin")
	public String postLogin(String submit) {
		System.out.println(submit);
		return "session/login";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "session/loginForm";
	}
	
	@PostMapping("/loginForm")
	public String loginForm(LoginForm form) {
		System.out.println(form.getUserId());
		System.out.println(form.getPassword());
		return "session/loginForm";
	}
}
