package com.one_to_many_mapping_bi_dir.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one_to_many_mapping_bi_dir.entities.Course;
import com.one_to_many_mapping_bi_dir.entities.Student;
import com.one_to_many_mapping_bi_dir.service.StudentService;


@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
//	@PostMapping
//	public Student addStudentListOfCourse(@RequestBody Student student) {
//		
//		List<Course> courses = student.getCourses();
//		
//		return studentService.addStudent(student,courses);
//	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
				
		return studentService.addStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudent(){
		
		return studentService.getAllStudent();
	}

	@GetMapping("/{studentId}")
	public Student getStudent(@PathVariable long studentId) {
		
		return studentService.getStudent(studentId);
	}
	
	@GetMapping("/byFirstName/{firstName}")
	public Student getStudentByFirstName(@PathVariable String firstName) {
		
		return studentService.findStudentByfirstName(firstName);
	}
	
	@GetMapping("/course/{courseId}")
	public List<Student> getStudentByCourseId(@PathVariable long courseId) {
		
		return studentService.findStudentByCourses_CourseId(courseId);
	}
	
}
