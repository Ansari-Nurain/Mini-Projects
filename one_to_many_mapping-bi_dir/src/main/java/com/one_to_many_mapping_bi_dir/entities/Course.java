package com.one_to_many_mapping_bi_dir.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	private String title;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	@JsonBackReference
	private Student student;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long courseId, String title, String description) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.description = description;
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
