package com.hcl.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.course.dto.CourseDto;
import com.hcl.course.service.CourseService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Laxman
 *
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public ResponseEntity<List<CourseDto>> getAllCourse(){
		
		log.info("");
		return new ResponseEntity<>(courseService.getAllCourse(), HttpStatus.OK);
	}
}
