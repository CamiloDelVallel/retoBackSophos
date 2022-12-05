/**
 * 
 */
package com.camilodelvalle.reto.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camilodelvalle.reto.entity.Affiliates;
import com.camilodelvalle.reto.repository.AffiliatesRepository;
import com.camilodelvalle.reto.service.AffiliatesService;


/**
 * @author Camilo Del Valle
 * @version 1.0 1/12/2022 
 * Clase que implementa la lógica de negocio de la interfaz de Affiliates
 */

@Service
public class AffiliatesServiceImpl implements AffiliatesService {
	/**
	 * Bean repository de spring inyectado para ejecutar el CRUD.
	 */

	
	@Autowired
	private AffiliatesRepository affiliatesRepository;
	

	@Override
	public List<Affiliates> getList() {
		List<Affiliates> affiliatesDataSource = StreamSupport.stream(this.affiliatesRepository.findAll().spliterator(), false)
				.collect(Collectors.toList()); //el stream lo que hace es que los consulta todos y despues los lleva a una lista con collect
		return affiliatesDataSource;
	}
	
	@Override
	public List<Affiliates> getById() {
		List<Affiliates> affiliatesDataSource = StreamSupport.stream(this.affiliatesRepository.findAll().spliterator(), false)
				.collect(Collectors.toList()); //el stream lo que hace es que los consulta todos y despues los lleva a una lista con collect
		return affiliatesDataSource; //FALTA HACERLO COMO USUARIO
	}

	@Override
	public Affiliates post(Affiliates affiliates) {
		return this.affiliatesRepository.save(affiliates);
	}

	@Override
	public Affiliates put(Affiliates affiliates) {
		if(affiliates!=null) {
			return this.affiliatesRepository.save(affiliates);
		}
		return null;
	}

	@Override
	public void deleteId(Long id) {
		this.affiliatesRepository.deleteById(id);
	}
}
