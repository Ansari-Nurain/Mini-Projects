package com.one_to_one_mapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one_to_one_mapping.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	public Student findStudentByFirstName(String firstName);
	
	public Student findStudentByCourse_CourseId(long courseId);
	
	public List<Student> findStudentByCourseTitle(String title);


}
