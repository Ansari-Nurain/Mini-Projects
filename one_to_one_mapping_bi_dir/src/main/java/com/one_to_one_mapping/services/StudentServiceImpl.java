package com.one_to_one_mapping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.one_to_one_mapping.entities.Course;
import com.one_to_one_mapping.entities.Student;
import com.one_to_one_mapping.repository.CourseRepository;
import com.one_to_one_mapping.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
//	@Autowired 
//	private CourseRepository courseRepository;
	

//	@Override
//	public Student createStudent(Student student,Course course) {
//		
//		student.setCourse(course);
//
//		course.setStudent(student);
//		
//		return studentRepo.save(student);
//	}

//	@Override
//	public Student createStudent(Student student) {
//		
//		student.setCourse(student.getCourse());
//	
//	    course.setStudent(course.getStudent());
//
//		
//		return studentRepo.save(student);
//	}
	

	@Override
	public Student createStudent(Student student) {
		
//		Course course = student.getCourse();
//		
//		courseRepository.save(course);

		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {

		return studentRepo.findAll();
	}

	@Override
	public Student getStudent(long studentId) {

		Student student = studentRepo.findById(studentId).orElse(null);
		if (student == null) {
			throw new RuntimeException("Student not found");
		}
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(long studentId, Student student) {

		Student student2 = studentRepo.findById(studentId).orElse(null);

		if (student2.getStudentId() == studentId) {
			student2.setFirstName(student.getFirstName());
			student2.setLastName(student.getLastName());
		}

		return studentRepo.save(student);
	}

	@Override
	public String deleteStudent(long studentId) {

		Student student = studentRepo.findById(studentId).orElse(null);

		if (student.getStudentId() == studentId) {

			studentRepo.deleteById(studentId);
			return "Deleted";
		} else {
			throw new RuntimeException("Student not found");
		}

	}

	@Override
	public Student findStudentByfirstName(String firstName) {

		return studentRepo.findStudentByFirstName(firstName);
	}

	@Override
	public Student findStudentByCourse_CourseId(long courseId) {

		return studentRepo.findStudentByCourse_CourseId(courseId);
	}

	@Override
	public List<Student> findStudentByCourseTitle(String title) {

		return studentRepo.findStudentByCourseTitle(title);
	}

}
