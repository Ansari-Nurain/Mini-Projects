package com.one_to_many_mapping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one_to_many_mapping.entities.Course;
import com.one_to_many_mapping.repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public Course addCourse(Course course) {
		
		return courseRepo.save(course);
	}

	@Override
	public List<Course> getAllCourse() {

		return courseRepo.findAll();
	}

	@Override
	public Course getCourse(long courseId) {

		Course course = courseRepo.findById(courseId).orElse(null);
		
		if(course==null) {
			throw new RuntimeException("Course not found");
		}
		
		return course;
	}

}
