package com.one_to_one_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one_to_one_mapping.entities.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{

}
