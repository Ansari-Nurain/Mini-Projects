package com.one_to_one_mapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	private String title;
	private String description;
	

	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long courseId, String title, String description, Student student) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.description = description;
		this.student = student;
	}



	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", description=" + description + ", student="
				+ student + "]";
	}
	
	

}
