package com.greatlearning.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;

//@Controller
@RestController
public class ExampleController {

	@GetMapping("/info")
//	@ResponseBody
	public GreatLearning get() {
		GreatLearning greatlearning = new GreatLearning();
		greatlearning.setCourseName("GL");
		greatlearning.setCourseType("IT");
		greatlearning.setInstructorName("Arun");
		return greatlearning;

	}

	@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		GreatLearning greatlearning = new GreatLearning();
		greatlearning.setCourseName(courseName);
		greatlearning.setCourseType(courseType);
		greatlearning.setInstructorName(instructorName);
		return greatlearning;
	}

}
