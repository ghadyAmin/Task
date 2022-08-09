package com.task5.Task.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.task5.Task.models.Result;

@RestController
@RequestMapping("/api")
public class TaskController {
    
	
	@GetMapping( "/get")
	
	public ResponseEntity<?> addNum(@RequestParam int x, @RequestParam int y) {
		return  ResponseEntity.ok(new Result(x,y, x+y)) ;
	}
	
	 
}
