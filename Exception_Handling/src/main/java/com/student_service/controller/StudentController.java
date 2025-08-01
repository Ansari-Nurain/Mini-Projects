package com.student_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student_service.entity.Student;
import com.student_service.service.StudentService;

@RestController
@RequestMapping("/students2")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		
		return studentService.addStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudent(){
		
		return studentService.getAllStudent();
	}
	
//	@GetMapping("/{studentId}")
//	public Student getStudentById(@PathVariable long studentId) {
//		
//		 return studentService.getStudentById(studentId);
//	}
	
	@GetMapping("/{studentId}")
	public Student getStudentById(@PathVariable long studentId) {
		
		 return studentService.getStudentById(studentId);
	}
	
	
//	@GetMapping("/{studentId}")
//	public ResponseEntity<Student> getStudentById(@PathVariable long studentId) {
//		
//		 return studentService.getStudentById(studentId);
//	}
	
	
//	@GetMapping("/{studentId}")
//	public ResponseEntity<?> getStudentById(@PathVariable long studentId) {
//		
//		 return studentService.getStudentById(studentId);
//	}
	
	
//	@GetMapping("/{studentId}")
//	public ResponseEntity<String> getStudentById(@PathVariable long studentId) {
//		
//		 return studentService.getStudentById(studentId);
//	}
	
	
	
	@PutMapping("/{studentId}")
	public Student updateStudent(@PathVariable long studentId, @RequestBody Student student) {
		
		return studentService.updateStudent(studentId, student);
	}
	
	@DeleteMapping("/{studentId}")
	public String deleteStudent(@PathVariable long studentId) {
		
		return studentService.deleteStudent(studentId);
	}

}
