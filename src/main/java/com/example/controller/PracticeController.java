package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Practice;
import com.example.service.PracticeService;
@RestController
@RequestMapping("/practice")
public class PracticeController {
	@Autowired
	public PracticeService practiceService;
	
	@PostMapping("/save")
	public ResponseEntity savePractice(@RequestBody Practice practice) {
		Practice pr=practiceService.savePractice(practice);
		return ResponseEntity.ok().body(practice);
	}

}
