package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	 @GetMapping("/api/hello")
	    public String test() {
	        return "Hello, world!!!";
	    }
}
