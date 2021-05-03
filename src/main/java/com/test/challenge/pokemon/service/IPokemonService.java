/*************************
 * 
 * 
 * IPokemonService.java
 *
 * Control de versiones:
 *
 * Version  Date                    By                  
 * -------  -------------------     ----------------   
 * 1.0      3 may. 2021		        Guillermo Ventura		 
 * 
 * Descripcion: CLase para manejo de la logica
 * 
 **************************/
package com.test.challenge.pokemon.service;

/**
 *Descripcion: CLase para manejo de la logica
 *
 */
public interface IPokemonService {

	/**
	 * Metodo para consumir el API de pokemon
	 * 
	 * @param namePokemon nombre del pokemon
	 * @param metodo metodo a realizar
	 * @return json
	 */
	String getAbilities(String namePokemon);
	
	/**
	 * Metodo para obtener la experiencia
	 * @param namePokemon
	 * @return
	 */
	Integer getBaseExperience(String namePokemon);
	
	/**
	 * Metodo para obtener el ID
	 * @param namePokemon
	 * @return
	 */
	Integer getId(String namePokemon);
	
	
	/**
	 * Metodo para obtener el area
	 * @return
	 */
	String getLocationArea(String namePokemon);
}
