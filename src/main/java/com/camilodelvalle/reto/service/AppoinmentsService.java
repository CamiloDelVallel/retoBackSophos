/**
 * 
 */
package com.camilodelvalle.reto.service;

import java.util.List;

import com.camilodelvalle.reto.entity.Appoinments;




/**
 * @author Camilo Del Valle
 * @version 1.0 1/12/2022 
 * Interface que contiene los métodos de logica del negocio para los affiliates.
 */
public interface AppoinmentsService {
	
	/**
	 * @author Camilo Del Valle
	 * @version 1.0 1/12/2022 
	 * Metodo que permite consultar un listado de affiliates
	 * @return listado de Tests
	 */
	List<Appoinments> getList();
	
	List<Appoinments> getById();

	Appoinments post(Appoinments appoinments);

	Appoinments put(Appoinments appoinments);

	void delete(Long id);
	
	List<Appoinments> getByDate();
	
	List<Appoinments> getByAffiliates();

	
}

