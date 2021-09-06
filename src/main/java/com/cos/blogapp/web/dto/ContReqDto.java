package com.cos.blogapp.web.dto;

import com.cos.blogapp.domain.board.Contents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ContReqDto {

	
	private String username;
	private String content;
	private String title;
	public Contents toEntity() {
		Contents cont	= new Contents();
		cont.setUsername(username);
		cont.setContent(content);
		cont.setTitle(title);
		
		return cont;
	}
	
}
