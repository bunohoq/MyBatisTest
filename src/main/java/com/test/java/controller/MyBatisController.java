package com.test.java.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.java.model.AddressDTO;
import com.test.java.model.MyBatisDAO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MyBatisController {
	
	//@Autowired
	private final MyBatisDAO dao;
	
		
	@GetMapping("/test.do")
	public String test() {
		
		System.out.println(dao != null);
		
		return "result";
	}
	
	
	//스프링(자바) > SQL 실행(MyBatis 사용) > DB
	
	//반환값(X), 인자값(X) > 정적 쿼리
	@GetMapping("/m1.do")
	public String m1() {
		
		dao.m1();
		
		return "result";		
	}
	
	
	//반환값(X), 인자값(O)
	@GetMapping("/m2.do")
	public String m2(Model model, @RequestParam("seq") String seq) {
		
		//- m2.do?seq=1
		int result = dao.m2(seq); //1, 0
		
		model.addAttribute("result", result);
		
		return "result";
	}
	
	//반환값(X), 인자값(O)
	@GetMapping("/m3.do")
	public String m3(Model model) {
		
		//update
		//2,아무개,20,서울시 강남구 대치동,m
		
		//DTO or Map
		Map<String,String> map = new HashMap<String,String>();
		map.put("seq", "2");
		map.put("age", "21");
		map.put("address", "서울시 강남구 역삼동");
		
		int result = dao.m3(map);
		
		model.addAttribute("result", result);
		
		return "result";		
	}
	
	//반환값(X), 인자값(O)
	@GetMapping("/m4.do")
	public String m4(Model model) {
		
		//update
		//2,아무개,22,서울시 강남구 압구정동,m
		
		//DTO or Map
		AddressDTO dto = new AddressDTO();
		dto.setSeq("2");
		dto.setAge(22);
		dto.setAddress("서울시 강남구 압구정동");
		
		int result = dao.m4(dto);
		
		model.addAttribute("result", result);
		
		return "result";		
	}
	
	
	//반환값(O) > 원자값(숫자, 문자열 등)
	@GetMapping("/m5.do")
	public String m5(Model model, String seq) {
		
		//-m5.do?seq=2 > 이름 반환
		String name = dao.m5(seq);
		
		model.addAttribute("name", name);
		
		return "result";		
	}
	
	
	//반환값(O) > 레코드 1개 반환
	@GetMapping("/m6.do")
	public String m6(Model model, String seq) {
		
		//-m6.do?seq=2 > 해당 레코드 전체 반환
		AddressDTO dto = dao.m6(seq);
		
		model.addAttribute("dto", dto);
		
		return "result";
	}
	
	//반환값(O) > 레코드 N개 반환
	@GetMapping("/m7.do")
	public String m7(Model model) {
		
		//List<String> names
		List<String> names = dao.m7();
		
		model.addAttribute("names", names);
		
		return "list";
	}
	
	
	//반환값(O) > 레코드 N개 반환
	@GetMapping("/m8.do")
	public String m8(Model model) {
		
		//List<AddressDTO> list
		List<AddressDTO> list = dao.m8();
		
		model.addAttribute("list", list);
		
		return "list";
	}
	

}
