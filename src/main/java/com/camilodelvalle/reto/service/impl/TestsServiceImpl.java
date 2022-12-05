/**
 * 
 */
package com.camilodelvalle.reto.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.camilodelvalle.reto.entity.Tests;
import com.camilodelvalle.reto.repository.TestsRepository;
import com.camilodelvalle.reto.service.TestsService;

/**
 * @author Camilo Del Valle
 * @version 1.0 1/12/2022 
 * Clase que implementa la lógica de negocio de la interfaz de TestsService
 */

@Service
public class TestsServiceImpl implements TestsService {
	/**
	 * Bean repository de spring inyectado para ejecutar el CRUD.
	 */

	
	@Autowired
	private TestsRepository testsRepository;
	

	@Override
	public List<Tests> getList() {
		List<Tests> testsDataSource = StreamSupport.stream(this.testsRepository.findAll().spliterator(), false)
				.collect(Collectors.toList()); //el stream lo que hace es que los consulta todos y despues los lleva a una lista con collect
		return testsDataSource;
	}
	
	@Override
	public List<Tests> getById() {
		List<Tests> testsDataSource = StreamSupport.stream(this.testsRepository.findAll().spliterator(), false)
				.collect(Collectors.toList()); //el stream lo que hace es que los consulta todos y despues los lleva a una lista con collect
		return testsDataSource; //FALTA HACERLO COMO USUARIO
	}

	@Override
	public Tests post(Tests tests) {
		return this.testsRepository.save(tests);
	}

	@Override
	public Tests put(Tests tests) {
		if(tests!=null) {
			return this.testsRepository.save(tests);
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		this.testsRepository.deleteById(id);
	}

}