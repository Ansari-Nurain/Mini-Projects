package com.school_management_system.controllers;

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

import com.school_management_system.entities.Teacher;
import com.school_management_system.services.TeacherService;



@RestController
@RequestMapping("/teachers")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		
		return teacherService.addTeacher(teacher);
	}
	
	@GetMapping
	public List<Teacher> getAllTeacher(){
		
		return teacherService.getAllTeacher();
	}
	
	@GetMapping("/{teacherId}")
	public Teacher getById(@PathVariable long teacherId) {
		
		return teacherService.getTeacherById(teacherId);
	}
	
	@PutMapping("/{teacherId}")
	public Teacher updateTeacher(@PathVariable long teacherId,@RequestBody Teacher teacher) {
		
		return teacherService.updateTeacher(teacherId, teacher);
	}
	
	@DeleteMapping("/{teacherId}")
	public String deleteTeacher(@PathVariable long teacherId) {
		
		return teacherService.deleteTeacher(teacherId);
	}

}
