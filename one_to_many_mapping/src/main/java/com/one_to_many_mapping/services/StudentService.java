package com.one_to_many_mapping.services;

import java.util.List;

import com.one_to_many_mapping.entities.Course;
import com.one_to_many_mapping.entities.Student;

public interface StudentService {
	
	public Student addStudent(Student student, List<Course> courses);
	
	public Student addStudent(Student student);

	
	public List<Student> getAllStudent();
	
	public Student getStudent(long studentId);

}
