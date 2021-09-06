package com.cos.blogapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.blogapp.domain.board.ContRepository;
import com.cos.blogapp.web.dto.ContReqDto;

@Controller
public class ContController {

	private ContRepository contRepository;
	private HttpSession	session;
	
	public ContController (ContRepository  contRepository,HttpSession	session) {
		
		this.contRepository = contRepository;
		this.session		= session;
	}
	
	@GetMapping("/WriteForm")
	public String WriteForm() {
		System.out.println("글쓰기");
		return "/contents/WriteForm";
	}
	
	@PostMapping("/Write")
	public String Write(ContReqDto dto) {
		
		contRepository.save(dto.toEntity());
		return "redirect:/LoginHome";
	}
	
}
