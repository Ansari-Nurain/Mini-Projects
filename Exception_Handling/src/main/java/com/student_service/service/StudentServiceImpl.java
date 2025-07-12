package com.student_service.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student_service.entity.Course;
import com.student_service.entity.Student;
import com.student_service.exceptions.StudentNotFoundException;
import com.student_service.repository.StudentRepository;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.EntityNotFoundException;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;

//	@Override
//	public Student addStudent(Student student) {
//				
//		return studentRepo.save(student);
//	}
	
	@Override
	public Student addStudent(Student student) {
	    // Set the student on each course
	    for (Course course : student.getCourses()) {
	        course.setStudent(student);
	    }

	    return studentRepo.save(student);
	}


	@Override
	public List<Student> getAllStudent() {

		return studentRepo.findAll();
	}
	
	
//	give exception message on console
	
//	@Override
//	public Student getStudentById(long studentId) {
//
//		Student student = studentRepo.findById(studentId).orElse(null);
//		if(student==null) {
//			throw new EntityNotFoundException("Student Not Found with "+studentId);
//		}
//		
//		return student;
//	}
	
	
	
//	Create one class StudentNotFoundException inside exception package and give the exception message on the console
	
	@Override
	public Student getStudentById(long studentId) {

		Student student = studentRepo.findById(studentId).orElse(null);
		if(student==null) {
			throw new StudentNotFoundException("Student Not Found with "+studentId);
		}
		
		return student;
	}
	
	
//	Give Custom message with status code for the user
	
//	@Override
//	public ResponseEntity<?> getStudentById(long studentId) {
//
//		Student student = studentRepo.findById(studentId).orElse(null);
//		if(student==null) {
//			return new ResponseEntity<>("Student Not Found with " + studentId, HttpStatus.NOT_FOUND);
//		}
//		
//		return new ResponseEntity<>(student,HttpStatus.OK);
//	}
	
	
//	Give only status code for the user
	
//	@Override
//	public ResponseEntity<Student> getStudentById(long studentId) {
//
//		Student student = studentRepo.findById(studentId).orElse(null);
//		if(student==null) {
//			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
//		}
//		
//		return new ResponseEntity<>(student,HttpStatus.OK);
//	}
	
	
//	Give Custom message with status code for the user
	
//	@Override
//	public ResponseEntity<String> getStudentById(long studentId) {
//
//		Student student = studentRepo.findById(studentId).orElse(null);
//		if(student==null) {
//			return new ResponseEntity<String>("Student Not Found With Id : " + studentId,HttpStatus.NOT_FOUND);
//		}
//		
//		return new ResponseEntity<String>(HttpStatus.OK);
//	}
	

	@Override
	public Student updateStudent(long studentId, Student student) {

		Student orElse = studentRepo.findById(studentId).orElse(null);
		
		if(orElse.getStudentId()==studentId) {
			orElse.setStudentId(student.getStudentId());
			orElse.setFirstName(student.getFirstName());
			orElse.setLastName(student.getLastName());
			orElse.setEmail(student.getEmail());
			orElse.setPhoneNumber(student.getPhoneNumber());
			orElse.setGender(student.getGender());
		}else {
			throw new EntityNotFoundException("Student not found with "+studentId);
		}
		
		return studentRepo.save(student);
	}

	@Override
	public String deleteStudent(long studentId) {

		studentRepo.deleteById(studentId);
		
		return "Deleted";
	}

}
