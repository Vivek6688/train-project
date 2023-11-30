package com.CourseCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CourseCrud.Binding.Course;
import com.CourseCrud.service.CourseServiceInt;

@RestController
public class MainController {
	
	@Autowired
	private CourseServiceInt service;
	
	@PostMapping("/course")
	public ResponseEntity<String> upsert(@RequestBody Course course){
		
		String status = service.upsert(course);
		
		return new ResponseEntity<String>(status, HttpStatus.CREATED);
		
		
	}

}
