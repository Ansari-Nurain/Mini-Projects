package com.school_management_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school_management_system.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
