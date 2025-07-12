package com.one_to_one_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one_to_one_mapping.entities.Course;
import com.one_to_one_mapping.entities.Student;

public interface CourseRepository extends JpaRepository<Course,Long>{
	
	public Course findCourseByStudent(Student student);

}
