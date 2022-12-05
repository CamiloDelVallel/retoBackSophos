package com.camilodelvalle.reto.controllers;

import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import com.camilodelvalle.reto.service.TestsService;

@ExtendWith(MockitoExtension.class)
class TestsControllerTest {

	@InjectMocks
	private TestsController testsController = new TestsController();
	
	@Mock
	private TestsService serviceTestsMock;
	
	@Test
	void testGetTests() {
		when(serviceTestsMock.getList()).thenReturn(Collections.emptyList());
		var response = testsController.getList();
		Assertions.assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
	}

}
