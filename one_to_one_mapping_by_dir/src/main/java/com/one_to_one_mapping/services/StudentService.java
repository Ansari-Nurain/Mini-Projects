package com.one_to_one_mapping.services;

import java.util.List;

import com.one_to_one_mapping.entities.Course;
import com.one_to_one_mapping.entities.Student;

public interface StudentService {
	
//	public Student createStudent(Student student, Course course);
	
	public Student createStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudent(long studentId);
	
	public Student updateStudent(long studentId, Student student);
	
	public String deleteStudent(long studentId);

}
