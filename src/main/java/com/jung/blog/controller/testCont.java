package com.jung.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testCont {
	@GetMapping("/test/hello")
	public String test() {
		return "<h1>hello</h1>";
	}
}
