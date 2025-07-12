package com.one_to_many_mapping_bi_dir.service;

import java.util.List;

import com.one_to_many_mapping_bi_dir.entities.Course;

public interface CourseService {
	
	public Course addCourse(Course course);
	
	public List<Course> getAllCourse();
	
	public Course getCourse(long courseId);

}
