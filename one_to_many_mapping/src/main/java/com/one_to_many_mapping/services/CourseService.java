package com.one_to_many_mapping.services;

import java.util.List;

import com.one_to_many_mapping.entities.Course;

public interface CourseService {
	
	public Course addCourse(Course course);
	
	public List<Course> getAllCourse();
	
	public Course getCourse(long courseId);

}
