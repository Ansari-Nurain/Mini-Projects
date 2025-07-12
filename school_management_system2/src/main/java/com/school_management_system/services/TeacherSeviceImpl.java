package com.school_management_system.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school_management_system.entities.Teacher;
import com.school_management_system.repositories.TeacherRepository;
import com.teacher_service.exception.TeacherNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TeacherSeviceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepo;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		
		return teacherRepo.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {

		return teacherRepo.findAll();
	}

	@Override
	public Teacher getTeacherById(long teacherId) {

	  Teacher teacher =	teacherRepo.findById(teacherId).orElse(null);
	  if(teacher==null) {
		  throw new EntityNotFoundException("Teacher not found with "+teacherId);
	  }
		
		return teacher;
	}

	@Override
	public Teacher updateTeacher(long teacherId,Teacher teacher) {

		Teacher orElse = teacherRepo.findById(teacherId).orElse(null);
		
		if(orElse.getTeacherId()==teacherId) {
			orElse.setTeacherId(teacher.getTeacherId());
			orElse.setFirstName(teacher.getFirstName());
			orElse.setLastName(teacher.getLastName());
			orElse.setEmail(teacher.getEmail());
			orElse.setPhoneNumber(teacher.getPhoneNumber());
		}else {
			
			throw new TeacherNotFoundException("Teacher not found with "+teacherId);
		}
		
		return teacherRepo.save(teacher);
	}

	@Override
	public String deleteTeacher(long teacherId) {

		teacherRepo.deleteById(teacherId);
		
		return "Deleted";
	}

}
