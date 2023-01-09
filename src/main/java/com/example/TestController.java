package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/test")
	public UserDto test() {
		UserDto userDto = new UserDto();
		userDto.setAge(10);
		userDto.setName("이미나");
		
		System.out.println("객체 정보:" + userDto.toString());
		
		return userDto;
	}
	
	@GetMapping(value = "/test1") 
	public StudentDto test1() {
		StudentDto s = new StudentDto();
		s.setName("yuna");
		s.setAge(20);
		s.setJavaGrade("A+");
		s.setOracleGrade("C");
		
		return s;
	}
	
	@GetMapping(value = "/test2") 
	public StudentDto test2() {
		StudentDto s = new StudentDto();
		s.setName("jimin");
		s.setAge(21);
		s.setJavaGrade("B+");
		s.setOracleGrade("F");
		
		return s;
	}
}
