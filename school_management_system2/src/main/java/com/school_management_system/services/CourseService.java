package com.school_management_system.services;

import java.util.List;

import com.school_management_system.entities.Course;

public interface CourseService {
	
	public Course addCourse(Course course);
	
	public List<Course> getAllCourse();
	
	public Course getCourseById(long courseId);
	
	public Course updateCourse(long courseId, Course course);
	
	public String deleteCourse(long courseId);
	
	public List<Course> getCourseByStudentId(long studentId);
	
	public List<Course> getCourseByTeacherId(long teacherId);


}
