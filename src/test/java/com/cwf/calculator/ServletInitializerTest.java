package com.cwf.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.builder.SpringApplicationBuilder;

@ExtendWith(MockitoExtension.class)
public class ServletInitializerTest {
	  @Mock
	  private SpringApplicationBuilder springApplicationBuilder;

	  @Test
	  public void testIt() {
		  
	    ServletInitializer servletInitializer = new ServletInitializer();
	    Mockito.when(springApplicationBuilder.sources(CalculatorApplication.class)).thenReturn(springApplicationBuilder);

	    SpringApplicationBuilder result = servletInitializer.configure(springApplicationBuilder);

	    Mockito.verify(springApplicationBuilder).sources(CalculatorApplication.class);
	    assertEquals(springApplicationBuilder,result);
	  }
}
