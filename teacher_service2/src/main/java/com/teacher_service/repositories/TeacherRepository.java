package com.teacher_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teacher_service.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
