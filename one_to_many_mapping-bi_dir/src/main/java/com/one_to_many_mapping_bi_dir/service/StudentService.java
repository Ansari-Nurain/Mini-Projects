package com.one_to_many_mapping_bi_dir.service;

import java.util.List;

import com.one_to_many_mapping_bi_dir.entities.Course;
import com.one_to_many_mapping_bi_dir.entities.Student;

public interface StudentService {
	
//	public Student addStudent(Student student, List<Course> courses);
	
	public Student addStudent(Student student);

	
	public List<Student> getAllStudent();
	
	public Student getStudent(long studentId);
	
	Student findStudentByfirstName(String firstName);

	List<Student> findStudentByCourses_CourseId(long courseId);

}
