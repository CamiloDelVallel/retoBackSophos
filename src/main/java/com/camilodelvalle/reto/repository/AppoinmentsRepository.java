/**
 * 
 */
package com.camilodelvalle.reto.repository;

import org.springframework.data.repository.CrudRepository;

import com.camilodelvalle.reto.entity.Appoinments;

/**
 * @author Camilo Del Valle
 * @version 1.0 1/12/2022 
 * Interface que contiene el CRUD con Spring JPA para la tabla de Appoinments
 */
public interface AppoinmentsRepository extends CrudRepository<Appoinments, Long> {

}
