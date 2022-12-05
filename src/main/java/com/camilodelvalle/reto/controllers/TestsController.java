/**
 * 
 */
package com.camilodelvalle.reto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.camilodelvalle.reto.entity.Tests;
import com.camilodelvalle.reto.service.TestsService;

/**
 * @author Camilo Del Valle
 * @version 1.0 1/12/2022 
 * Controlador que manipula el flujo de los servicios REST del microservicio Tests.
 */

@RestController
@RequestMapping("/tests")
public class TestsController {
	
	@Autowired
	private TestsService testsServiceImpl;
	
	@GetMapping
	@RequestMapping(value = "getList", method = RequestMethod.GET)
	public ResponseEntity<?> getList() {
		List<Tests> testsConsultados = this.testsServiceImpl.getList();
		if (testsConsultados.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(testsConsultados);
		}
		
	}
	
	@GetMapping
	@RequestMapping(value = "getById/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getById() {
		List<Tests> testsConsultadosUsuario = this.testsServiceImpl.getById();
		return ResponseEntity.ok(testsConsultadosUsuario);
	}
	
	@PostMapping
	@RequestMapping(value = "post", method = RequestMethod.POST)
	public ResponseEntity<?> post(@RequestBody Tests tests) {
		Tests testsGuardado = this.testsServiceImpl.post(tests);
		return ResponseEntity.status(HttpStatus.CREATED).body(testsGuardado);
	}

	@PutMapping
	@RequestMapping(value = "put", method = RequestMethod.PUT)
	public ResponseEntity<?> put(@RequestBody Tests tests) {
		Tests testsActualizado = this.testsServiceImpl.put(tests);
		return ResponseEntity.status(HttpStatus.CREATED).body(testsActualizado);
	}

	@DeleteMapping
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable Long id) {
		this.testsServiceImpl.delete(id);
		return ResponseEntity.ok().build();
	}
}