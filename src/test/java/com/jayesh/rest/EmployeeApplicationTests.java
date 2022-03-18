package com.jayesh.rest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class EmployeeApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnEmployees() throws Exception {
		this.mockMvc.perform(get("/employees")).andDo(print()).andExpect(status().isOk());
	}
	
	
	@Test
	public void shouldReturnEmployeeNames() throws Exception {
		this.mockMvc.perform(get("/employees")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("David")));
	}
	
}