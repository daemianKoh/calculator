package com.cwf.calculator.service.impl;

import org.springframework.stereotype.Service;

import com.cwf.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Integer add(int value1, int value2) {
		return value1 + value2;
	}

	@Override
	public Integer subtract(int value1, int value2) {
		return value1-value2;
	}

	
}
