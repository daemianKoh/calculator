package com.cwf.calculator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@RequestMapping(path = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String test() {
		return "HELLO WORLD";
	}
	
	@RequestMapping(path = "/test2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String test2() {
		return "HELLO WORLD";
	}
}
