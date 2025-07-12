package com.school_management_system.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school_management_system.entities.Course;
import com.school_management_system.entities.Student;
import com.school_management_system.entities.Teacher;
import com.school_management_system.repositories.CourseRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CourseSeviceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;

	@Autowired
	private StudentService  studentService;

	@Autowired
	private TeacherService teacherService;

	@Override
	public Course addCourse(Course course) {


//		Student student = new Student();
//		student.setStudentId(student.getStudentId());
//		student.setFirstName(student.getFirstName());
//		student.setLastName(student.getLastName());
//		student.setEmail(student.getEmail());
//		student.setGender(student.getGender());
//		student.setPhoneNumber(student.getPhoneNumber());
		
		course.setStudent(course.getStudent());

//		Teacher teacher = new Teacher();
//		teacher.setTeacherId(teacher.getTeacherId());
//		teacher.setFirstName(teacher.getFirstName());
//		teacher.setLastName(teacher.getLastName());
//		teacher.setEmail(teacher.getEmail());
//		teacher.setPhoneNumber(teacher.getPhoneNumber());

		course.setTeacher(course.getTeacher());
		
		return courseRepo.save(course);
	}
	


	@Override
	public List<Course> getAllCourse() {

		return courseRepo.findAll();
	}

	@Override
	public Course getCourseById(long courseId) {

		Course course = courseRepo.findById(courseId).orElse(null);
		if (course == null) {
			throw new EntityNotFoundException("Course not found with " + courseId);
		}

		return course;
	}

	@Override
	public Course updateCourse(long courseId, Course course) {

		Course orElse = courseRepo.findById(courseId).orElse(null);
		if (orElse.getCourseId() == courseId) {
			orElse.setCourseId(course.getCourseId());
			orElse.setTitle(course.getTitle());
			orElse.setDescription(course.getDescription());
		} else {
			throw new EntityNotFoundException("Course not found with " + courseId);
		}

		return courseRepo.save(course);
	}

	@Override
	public String deleteCourse(long courseId) {

		courseRepo.deleteById(courseId);

		return "Deleted";
	}

	@Override
	public List<Course> getCourseByStudentId(long studentId) {

		 return courseRepo.findCourseByStudent_StudentId(studentId);
	}

	@Override
	public List<Course> getCourseByTeacherId(long teacherId) {

		 return courseRepo.findCourseByTeacher_TeacherId(teacherId);
	}

}
