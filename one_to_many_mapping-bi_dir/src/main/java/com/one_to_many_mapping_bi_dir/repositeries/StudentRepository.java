package com.one_to_many_mapping_bi_dir.repositeries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one_to_many_mapping_bi_dir.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
	List<Student> findStudentByCourses_CourseId(long courseId);
	
	Student findStudentByfirstName(String firstName);
	
}
