package com.cwf.calculator.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.cwf.calculator.service.CalculatorService;

@SpringBootTest
public class CalculatorControllerTest {


    @Autowired
    private CalculatorController calculatorController;
    
    private MockMvc mockMvc;

    @Mock
    CalculatorService calculatorService;
    
    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(calculatorController).build();
    }
    
    @Test
    public void add() throws Exception {
        this.mockMvc.perform(get("/add").param("value1", "1")
        		.param("value2", "2")
           .accept(MediaType.parseMediaType(MediaType.APPLICATION_JSON_VALUE)))
           .andExpect(status().isOk())
           .andExpect(content().contentType("application/json"));

    }
    
    @Test
    public void subtract() throws Exception {
        this.mockMvc.perform(get("/subtract")
        		.param("value1", "1")
        		.param("value2", "2")
           .accept(MediaType.parseMediaType(MediaType.APPLICATION_JSON_VALUE)))
           .andExpect(status().isOk())
           .andExpect(content().contentType("application/json"));

    }
}
