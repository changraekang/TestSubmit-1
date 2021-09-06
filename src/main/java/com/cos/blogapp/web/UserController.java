package com.cos.blogapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.blogapp.domain.user.UserRepository;
import com.cos.blogapp.domain.user.Users;
import com.cos.blogapp.web.dto.JoinReqDto;
import com.cos.blogapp.web.dto.LoginReqDto;

@Controller
public class UserController {


	private UserRepository userRepository;
	private HttpSession session;
	
	public UserController(UserRepository userRepository,HttpSession session ) {
		this.userRepository = userRepository;
		this.session		= session;
	}
	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/LoginHome")
	public String LoginHome() {
		return "LoginHome";
	}
	
	@GetMapping("/JoinForm")
	public String joinForm() {
		
		return "/user/JoinForm";
		//return "/user/joinForm-1";
	}
	@GetMapping("/LoginForm")
	public String LoginForm() {
		return "/user/LoginForm";
	}
	@GetMapping("/UpdateUserForm")
	public String UpdateUserForm() {
		return "/user/UpdateUserForm";
	}
	
	
	@PostMapping("/login")
	public String login(LoginReqDto dto) {
		
		Users userEntitiy = userRepository.mLogin(dto.getUsername(), dto.getPassword());
		
		if (userEntitiy == null ) {
			return "redirect:/LoginForm";
		} else {
			session.setAttribute("principal", userEntitiy);
			return "redirect:/LoginHome";
		}
		
		
	}
	
	
	@PostMapping("/join")
	public String join(JoinReqDto dto) {
		userRepository.save(dto.toEntity());
		System.out.println("로긴");
		return "redirect:/LoginForm";
		
	}
	
	@PostMapping("/update")
	public String update(JoinReqDto dto) {
		userRepository.save(dto.toUpdate());
		System.out.println("수정");
		return "redirect:/LoginHome";
		
	}
}
