/*
 * package com.cos.blogapp.web;
 * 
 * import javax.servlet.http.HttpSession;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.GetMapping;
 * 
 * import com.cos.blogapp.domain.board.ContRepository;
 * 
 * @Controller public class ContController {
 * 
 * private ContRepository contRepository; private HttpSession session;
 * 
 * public ContController (ContRepository contRepository,HttpSession session) {
 * 
 * this.contRepository = contRepository; this.session = session; }
 * 
 * @GetMapping("/WriteFrom") public String writeForm() {
 * 
 * return "/contents/WriteForm"; }
 * 
 * 
 * }
 */