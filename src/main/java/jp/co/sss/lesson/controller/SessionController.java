package jp.co.sss.lesson.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@GetMapping("/loginRequest")
	public String loginRequest() {
		return "session/loginRequest";
	}
	
	@PostMapping("/loginRequest")
	public String loginRequest(LoginForm form, Model model) {
		model.addAttribute("userId", form.getUserId());
		model.addAttribute("password", form.getPassword());
		return "session/loginRequest";
	}
	
	@GetMapping("/loginSession")
	public String loginSession() {
		return "session/loginSession";
	}
	
	@PostMapping("/loginSession")
	public String loginSession(LoginForm form, HttpSession session) {
		if (form.getUserId() ==  123) {
			session.setAttribute("userId", form.getUserId());
			return "redirect:/";
		}else {
			return "session/loginSession";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
}








