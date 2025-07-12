package com.school_management_system.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	private String title;
	private String description;

	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "student_id") 
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacher_id") 
	private Teacher teacher;

}
