package com.school_management_system.services;

import java.util.List;

import com.school_management_system.entities.Student;

public interface StudentService {
	
	public Student addStudent(Student student);

	public List<Student> getAllStudent();
	
	public Student getStudentById(long studentId);
	
	public Student updateStudent(long studentId, Student student);
	
	public String deleteStudent(long studentId);

}
