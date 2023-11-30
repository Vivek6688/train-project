package com.CourseCrud.service;

import com.CourseCrud.Binding.Course;

public interface CourseServiceInt {

	public String upsert(Course course);
	
	public Course getCourse(int cID);
	
	
}
