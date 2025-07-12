package com.school_management_system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school_management_system.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	public List<Course> findCourseByStudent_StudentId(long studentId);

	public List<Course> findCourseByTeacher_TeacherId(long teacherId);

}
