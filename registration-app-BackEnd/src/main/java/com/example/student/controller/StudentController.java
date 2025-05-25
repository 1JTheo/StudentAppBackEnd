package com.example.student.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;

@RestController
public class StudentController {

	@GetMapping("/students")
	public String index() {
		return "Hi student, API is running fine!";
	}

	@CrossOrigin(origins = "http://localhost:5173")
	@PostMapping("/students")
	public String addStudent(@RequestBody Student student ) {
		// Here you would typically save the student to a database
		return "Student added successfully!";

	}

}