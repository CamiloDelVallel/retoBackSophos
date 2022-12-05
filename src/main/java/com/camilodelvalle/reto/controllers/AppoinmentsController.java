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

import com.camilodelvalle.reto.entity.Appoinments;
import com.camilodelvalle.reto.service.AppoinmentsService;



/**
 * @author Camilo Del Valle
 * @version 1.0 1/12/2022 
 * Controlador que manipula el flujo de los servicios REST del microservicio appoinments.
 */

@RestController
@RequestMapping("/appoinments")
public class AppoinmentsController {
	
	@Autowired
	private AppoinmentsService appoinmentsServiceImpl;
	
	@GetMapping
	@RequestMapping(value = "getList", method = RequestMethod.GET)
	public ResponseEntity<?> getList() {
		List<Appoinments> appoinmentsConsultados = this.appoinmentsServiceImpl.getList();
		if (appoinmentsConsultados.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(appoinmentsConsultados);
		}
	}
	
	@GetMapping
	@RequestMapping(value = "getById/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getById() {
		List<Appoinments> appoinmentsConsultadosUsuario = this.appoinmentsServiceImpl.getById();
		return ResponseEntity.ok(appoinmentsConsultadosUsuario);
	}
	
	@PostMapping
	@RequestMapping(value = "post", method = RequestMethod.POST)
	public ResponseEntity<?> post(@RequestBody Appoinments appoinments) {
		Appoinments appoinmentsGuardado = this.appoinmentsServiceImpl.post(appoinments);
		return ResponseEntity.status(HttpStatus.CREATED).body(appoinmentsGuardado);
	}

	@PutMapping
	@RequestMapping(value = "put", method = RequestMethod.PUT)
	public ResponseEntity<?> put(@RequestBody Appoinments affiliates) {
		Appoinments appoinmentsActualizado = this.appoinmentsServiceImpl.put(affiliates);
		return ResponseEntity.status(HttpStatus.CREATED).body(appoinmentsActualizado);
	}

	@DeleteMapping
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable Long id) {
		this.appoinmentsServiceImpl.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	@RequestMapping(value = "getByDate/{date}", method = RequestMethod.GET)
	public ResponseEntity<?> getByDate() {
		List<Appoinments> appoinmentsConsultados = this.appoinmentsServiceImpl.getByDate();
		return ResponseEntity.ok(appoinmentsConsultados);
	}
	
	@GetMapping
	@RequestMapping(value = "getByAffiliates/{id_affiliate}", method = RequestMethod.GET)
	public ResponseEntity<?> getByAffiliates() {
		List<Appoinments> appoinmentsConsultados = this.appoinmentsServiceImpl.getByAffiliates();
		return ResponseEntity.ok(appoinmentsConsultados);
	}
}