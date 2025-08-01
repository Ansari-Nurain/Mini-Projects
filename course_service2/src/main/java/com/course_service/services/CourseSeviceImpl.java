package com.course_service.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course_service.entities.Course;
import com.course_service.repositories.CourseRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CourseSeviceImpl implements CourseService{
	
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
	public Course getCourseById(long courseId) {

		Course course = courseRepo.findById(courseId).orElse(null);
		if(course==null) {
			throw new EntityNotFoundException("Course not found with "+courseId);
		}
		
		return course;
	}

	@Override
	public Course updateCourse(long courseId, Course course) {

		Course orElse = courseRepo.findById(courseId).orElse(null);
		if(orElse.getCourseId()==courseId) {
			orElse.setCourseId(course.getCourseId());
			orElse.setTitle(course.getTitle());
			orElse.setDescription(course.getDescription());
		}else {
			throw new EntityNotFoundException("Course not found with "+courseId);
		}
		
		return courseRepo.save(course);
	}

	@Override
	public String deleteCourse(long courseId) {

		courseRepo.deleteById(courseId);
		
		return "Deleted";
	}


	@Override
	public List<Course> findCourseByStudentId(long studentId) {

		return courseRepo.findByStudentId(studentId);
	}

	@Override
	public List<Course> findCourseByTeacherId(long teacherId) {

		return courseRepo.findByTeacherId(teacherId);
	}





}
