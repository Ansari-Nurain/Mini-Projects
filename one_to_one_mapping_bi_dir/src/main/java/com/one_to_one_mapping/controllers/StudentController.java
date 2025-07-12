package com.one_to_one_mapping.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one_to_one_mapping.entities.Course;
import com.one_to_one_mapping.entities.Student;
import com.one_to_one_mapping.services.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
//	@PostMapping
//	public Student createStudent(@RequestBody Student student) {
//		
//		Course course = student.getCourse();
//		Student student2 = course.getStudent();
//		
//		return studentService.createStudent(student,course);
//	}
	
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
			
		return studentService.createStudent(student);
	}
	
	
	@GetMapping
	public List<Student> getAllStudent() {
		
		return studentService.getAllStudent();
	}

	@GetMapping("/{studentId}")
	public Student getStudent(@PathVariable long studentId) {
		
		return studentService.getStudent(studentId);
	}
	
	@PutMapping("/{studentId}")
	public Student updateStudent(@PathVariable long studentId, @RequestBody Student student) {
		
		return studentService.updateStudent(studentId, student);
	}
	
	@DeleteMapping("/{studentId}")
	public String deleteStudent(@PathVariable long studentId) {
		
		return studentService.deleteStudent(studentId);
	}
	
	@GetMapping("/student/{firstName}")
	public Student getStudentByFirstName(@PathVariable String firstName) {
		
		return studentService.findStudentByfirstName(firstName);
	}
	
	@GetMapping("/course/{courseId}")
	public Student getStudentByCourseId(@PathVariable long courseId) {
		
		return studentService.findStudentByCourse_CourseId(courseId);
	}
	
	@GetMapping("/course/title/{title}")
	public List<Student> getStudentByCourseTitle(@PathVariable String title) {
		
		return studentService.findStudentByCourseTitle(title);
	}
	
	
}
