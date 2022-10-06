package com.cwf.calculator.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class CalculatorControllerTest {


    @Autowired
    private CalculatorController calculatorController;
    
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(calculatorController).build();
    }
    
    @Test
    public void test() throws Exception {
        this.mockMvc.perform(get("/test")
           .accept(MediaType.parseMediaType(MediaType.APPLICATION_JSON_VALUE)))
           .andExpect(status().isOk())
           .andExpect(content().contentType("application/json"));

    }
    @Test
    public void test2() throws Exception {
        this.mockMvc.perform(get("/test")
           .accept(MediaType.parseMediaType(MediaType.APPLICATION_JSON_VALUE)))
           .andExpect(status().isOk())
           .andExpect(content().contentType(MediaType.APPLICATION_ATOM_XML));

    }
}
