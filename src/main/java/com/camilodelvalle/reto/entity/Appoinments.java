/**
 * 
 */
package com.camilodelvalle.reto.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Camilo Del Valle
 * @version 1.0 1/12/2022 Controlador que manipula el flujo de los servicios
 *          REST del microservicio de Tests
 *      
 */

@Data
@Entity
@Table (name = "Appoinments")
public class Appoinments {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "dateAppoinments")
	private Date date;
	
	@Column(name = "hourAppoinments")
	private Date hour;
	
	@Column(name = "id_test")
	private int idTest;
	
	@Column(name = "id_affiliate")
	private int idAffiliate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getHour() {
		return hour;
	}

	public void setHour(Date hour) {
		this.hour = hour;
	}

	public int getId_test() {
		return idTest;
	}

	public void setId_test(int id_test) {
		this.idTest = id_test;
	}

	public int getId_affiliate() {
		return idAffiliate;
	}

	public void setId_affiliate(int id_affiliate) {
		this.idAffiliate = id_affiliate;
	}

	public Appoinments(Long id, Date date, Date hour, int id_test, int id_affiliate) {
		super();
		this.id = id;
		this.date = date;
		this.hour = hour;
		this.idTest = id_test;
		this.idAffiliate = id_affiliate;
	}

	public Appoinments() {
		super();
	}

	
}
