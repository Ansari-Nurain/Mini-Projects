package com.one_to_one_mapping.services;

import java.util.List;

import com.one_to_one_mapping.entities.Course;
import com.one_to_one_mapping.entities.Student;

public interface CourseService {
	
	public Course addCourse(Course course);
	
	public List<Course> getAllCourse();
	
	public Course getCourse(long courseId);
	
	public Course updateCourse(long courseId, Course course);
	
	public String deleteCourse(long courseId);
	
	public Course findCourseByStudent(long studentId);


}
