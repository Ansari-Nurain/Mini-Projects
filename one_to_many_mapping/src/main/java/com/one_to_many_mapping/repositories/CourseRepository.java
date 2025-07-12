package com.one_to_many_mapping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one_to_many_mapping.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
