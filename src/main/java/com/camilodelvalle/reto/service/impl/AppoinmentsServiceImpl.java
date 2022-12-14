/**
 * 
 */
package com.camilodelvalle.reto.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camilodelvalle.reto.entity.Appoinments;
import com.camilodelvalle.reto.repository.AppoinmentsRepository;
import com.camilodelvalle.reto.service.AppoinmentsService;


/**
 * @author Camilo Del Valle
 * @version 1.0 1/12/2022 
 * Clase que implementa la lógica de negocio de la interfaz de Appoinments
 */

@Service
public class AppoinmentsServiceImpl implements AppoinmentsService {
	/**
	 * Bean repository de spring inyectado para ejecutar el CRUD.
	 */

	
	@Autowired
	private AppoinmentsRepository appoinmentsRepository;
	

	@Override
	public List<Appoinments> getList() {
		List<Appoinments> appoinmentsDataSource = StreamSupport.stream(this.appoinmentsRepository.findAll().spliterator(), false)
				.collect(Collectors.toList()); //el stream lo que hace es que los consulta todos y despues los lleva a una lista con collect
		return appoinmentsDataSource;
	}
	
	@Override
	public List<Appoinments> getById() {
		List<Appoinments> appoinmentsDataSource = StreamSupport.stream(this.appoinmentsRepository.findAll().spliterator(), false)
				.collect(Collectors.toList()); //el stream lo que hace es que los consulta todos y despues los lleva a una lista con collect
		return appoinmentsDataSource; //FALTA HACERLO COMO USUARIO
	}

	@Override
	public Appoinments post(Appoinments appoinments) {
		return this.appoinmentsRepository.save(appoinments);
	}

	@Override
	public Appoinments put(Appoinments appoinments) {
		if(appoinments!=null) {
			return this.appoinmentsRepository.save(appoinments);
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		this.appoinmentsRepository.deleteById(id);
	}

	@Override
	public List<Appoinments> getByDate() {
		List<Appoinments> appoinmentsDataSource = StreamSupport.stream(this.appoinmentsRepository.findAll().spliterator(), false)
				.collect(Collectors.toList()); //el stream lo que hace es que los consulta todos y despues los lleva a una lista con collect
		return appoinmentsDataSource;
	}
	
	@Override
	public List<Appoinments> getByAffiliates() {
		List<Appoinments> appoinmentsDataSource = StreamSupport.stream(this.appoinmentsRepository.findAll().spliterator(), false)
				.collect(Collectors.toList()); //el stream lo que hace es que los consulta todos y despues los lleva a una lista con collect
		return appoinmentsDataSource;
	}

}

// @Query("SELECT A FROM Appointment A WHERE A.dateAppointment = ?1 ORDER BY A.affiliate.id")
