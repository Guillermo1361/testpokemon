/*************************
 * 
 * 
 * IBitacoraRepository.java
 *
 * Control de versiones:
 *
 * Version  Date                    By                  
 * -------  -------------------     ----------------   
 * 1.0      3 may. 2021		        Guillermo Ventura		 
 * 
 * Descripcion: Interface para las transacciones
 * 
 **************************/
package com.test.challenge.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.challenge.pokemon.entity.Bitacora;

/**
 * Descripcion: Interface para las transacciones
 * 
 */
public interface IBitacoraRepository extends JpaRepository<Bitacora, Long>{

}
