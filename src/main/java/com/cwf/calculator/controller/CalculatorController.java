package com.cwf.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cwf.calculator.service.CalculatorService;

@RestController
public class CalculatorController {
	
	@Autowired 
	CalculatorService calculatorService;
	
	@RequestMapping(path = "/add", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Integer add(@RequestParam int value1, @RequestParam int value2 ) {
		return calculatorService.add(value1, value2);
	}
	
	@RequestMapping(path = "/subtract", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Integer subtract(@RequestParam int value1, @RequestParam int value2 ) {
		return calculatorService.subtract(value1, value2);
	}
}
