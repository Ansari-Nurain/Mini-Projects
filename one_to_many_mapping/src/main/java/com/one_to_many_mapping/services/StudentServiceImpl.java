package com.one_to_many_mapping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one_to_many_mapping.entities.Course;
import com.one_to_many_mapping.entities.Student;
import com.one_to_many_mapping.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student addStudent(Student student, List<Course> courses) {
		
		student.setCourses(courses);
		
		return studentRepo.save(student);
	}
	
	@Override
	public Student addStudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {

		return studentRepo.findAll();
	}

	@Override
	public Student getStudent(long studentId) {

		Student student = studentRepo.findById(studentId).orElse(null);
		
		if(student==null) {
			throw new RuntimeException("Student not found");
		}
		
		return student;
	}


}
