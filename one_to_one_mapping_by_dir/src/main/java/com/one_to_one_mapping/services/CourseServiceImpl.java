package com.one_to_one_mapping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one_to_one_mapping.entities.Course;
import com.one_to_one_mapping.entities.Student;
import com.one_to_one_mapping.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public Course addCourse(Course course) {
		
		Student student = new Student();
		student.setStudentId(student.getStudentId());
		student.setFirstName(student.getFirstName());
		student.setLastName(student.getLastName());
		
		course.setStudent(course.getStudent());

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
			throw new RuntimeException("Student not found");
		}
		
		return course;
	}

	@Override
	public Course updateCourse(long courseId, Course course) {

		Course course2 = courseRepo.findById(courseId).orElse(null);
		
		if(course2.getCourseId()==courseId) {
			course2.setTitle(course.getTitle());
			course2.setDescription(course.getDescription());
		}else {
			throw new RuntimeException("Student not found");
		}
		
		return courseRepo.save(course);
	}

	@Override
	public String deleteCourse(long courseId) {

		courseRepo.deleteById(courseId);
		
		return "Deleted";
	}

}
