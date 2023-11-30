package com.CourseCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CourseCrud.Binding.Course;
import com.CourseCrud.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseServiceInt {

	@Autowired
	private CourseRepository repository;
	
	@Override
	public String upsert(Course course) {

		repository.save(course);

		return "Success";
	}

	@Override
	public Course getCourse(int cID) {
		// TODO Auto-generated method stub
		return null;
	}

}
