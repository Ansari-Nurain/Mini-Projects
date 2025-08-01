package com.school_management_system.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school_management_system.entities.Student;
import com.school_management_system.repositories.StudentRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student addStudent(Student student) {
				
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {

		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(long studentId) {

		Student student = studentRepo.findById(studentId).orElse(null);
		if(student==null) {
			throw new EntityNotFoundException("Student Not Found with "+studentId);
		}
		
		return student;
	}

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
