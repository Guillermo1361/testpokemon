/*************************
 * 
 * 
 * Bitacora.java
 *
 * Control de versiones:
 *
 * Version  Date                    By                  
 * -------  -------------------     ----------------   
 * 1.0      3 may. 2021		        Guillermo Ventura		 
 * 
 * Descripcion: Entity para registrar en la BD
 * 
 **************************/
package com.test.challenge.pokemon.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Descripcion: Entity para registrar en la BD
 * 
 *
 */
@Entity(name = "BITACORA")
@Table
public class Bitacora {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "IP", nullable = false, length = 16)
	private String ip;
	
	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)	
	private Date fecha;
	
	@Column(name = "METODO", nullable = false, length = 100)
	private String metodo;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the metodo
	 */
	public String getMetodo() {
		return metodo;
	}

	/**
	 * @param metodo the metodo to set
	 */
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	
	

}
