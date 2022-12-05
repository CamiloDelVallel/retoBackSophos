/**
 * 
 */
package com.camilodelvalle.reto.service;

import java.util.List;

import com.camilodelvalle.reto.entity.Tests;



/**
 * @author Camilo Del Valle
 * @version 1.0 1/12/2022 
 * Interface que contiene los métodos de logica del negocio para los Tests.
 */
public interface TestsService {
	
	/**
	 * @author Camilo Del Valle
	 * @version 1.0 1/12/2022 
	 * Metodo que permite consultar un listado de Tests
	 * @return listado de Tests
	 */
	List<Tests> getList();
	
	List<Tests> getById();

	Tests post(Tests tests);

	Tests put(Tests tests);

	void delete(Long id);

	
}

