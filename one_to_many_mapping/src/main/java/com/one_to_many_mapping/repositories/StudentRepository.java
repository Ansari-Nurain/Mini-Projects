package com.one_to_many_mapping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one_to_many_mapping.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
