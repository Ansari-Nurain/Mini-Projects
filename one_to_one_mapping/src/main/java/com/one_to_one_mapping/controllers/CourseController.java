//package com.one_to_one_mapping.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.one_to_one_mapping.entities.Course;
//import com.one_to_one_mapping.services.CourseService;
//
//@RestController
//@RequestMapping("/api/course")
//public class CourseController {
//	
//	@Autowired
//	private CourseService courseService;
//	
//	@PostMapping
//	public Course addCourse(@RequestBody Course course) {
//		
//		return courseService.addCourse(course);
//	}
//	
//	@GetMapping
//	public List<Course> getAllCourse(){
//		
//		return courseService.getAllCourse();
//	}
//	
//	@GetMapping("/{courseId}")
//	public Course getCourse(@PathVariable long courseId) {
//		
//		return courseService.getCourse(courseId);
//	}
//	
//	@PutMapping("/{courseId}")
//	public Course updateCourse(@PathVariable long courseId, @RequestBody Course course) {
//		
//		return courseService.updateCourse(courseId, course);
//	}
//	
//	@DeleteMapping("/{courseId}")
//	public String deleteCourse(@PathVariable long courseId) {
//		
//		return courseService.deleteCourse(courseId);
//	}
//
//}
