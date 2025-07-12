package com.school_management_system.services;

import java.util.List;

import com.school_management_system.entities.Teacher;

public interface TeacherService {

	public Teacher addTeacher(Teacher teacher);
	
	public List<Teacher> getAllTeacher();
	
	public Teacher getTeacherById(long teacherId);
	
	public Teacher updateTeacher(long teacherId,Teacher teacher);
	
	public String deleteTeacher(long teacherId);
	
}
