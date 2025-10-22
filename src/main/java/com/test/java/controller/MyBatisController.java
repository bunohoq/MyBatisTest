package com.test.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.java.model.MyBatisDAO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MyBatisController {
	
	//@autowired (나중에 발생할수있는 객체때문에 쓰면 X 유지보수 어려움)
	private final MyBatisDAO dao;
	
	@GetMapping("/test.do")
	public String test() {
		
		System.out.println(dao != null);
		
		return "result";
	}

}
