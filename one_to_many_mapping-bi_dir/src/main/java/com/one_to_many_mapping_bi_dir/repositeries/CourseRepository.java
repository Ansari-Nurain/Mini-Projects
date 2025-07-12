package com.one_to_many_mapping_bi_dir.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one_to_many_mapping_bi_dir.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
