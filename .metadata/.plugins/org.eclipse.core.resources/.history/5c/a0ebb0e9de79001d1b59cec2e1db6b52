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

import com.camilodelvalle.reto.service.AffiliatesService;

@ExtendWith(MockitoExtension.class)
class AppoinmentsControllerTest {

	@InjectMocks
	private AffiliatesController affiliatesController = new AffiliatesController();
	
	@Mock
	private AffiliatesService serviceAffiliatesMock;
	
	@Test
	void testGetAffiliate() {
		when(serviceAffiliatesMock.getList()).thenReturn(Collections.emptyList());
		var response = affiliatesController.getList();
		Assertions.assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
	}

}
