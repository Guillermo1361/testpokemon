/*************************
 * 
 * 
 * AbilitiesBean.java
 *
 * Control de versiones:
 *
 * Version  Date                    By                  
 * -------  -------------------     ----------------   
 * 1.0      3 may. 2021		        Guillermo Ventura		 
 * 
 * Descripcion: 
 * 
 **************************/
package com.test.challenge.pokemon.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author AGODESA10
 *
 */
public class ResponseAbilitiesBean implements Serializable{
	
	
	
	/**
	 * Serial Id
	 */
	private static final long serialVersionUID = 8521846311513423803L;
	
	
	private List<Abilities> abilities;
	
	@JsonProperty("base_experience")
	private String baseExperience;

	
	private Integer id;
	
	private String name;
	
	@JsonProperty("location_area_encounters")
	private String location;
	
	
	
	/**
	 * @return the abilities
	 */
	public List<Abilities> getAbilities() {
		return abilities;
	}

	/**
	 * @param abilities the abilities to set
	 */
	public void setAbilities(List<Abilities> abilities) {
		this.abilities = abilities;
	}

	/**
	 * @return the baseExperience
	 */
	public String getBaseExperience() {
		return baseExperience;
	}

	/**
	 * @param baseExperience the baseExperience to set
	 */
	public void setBaseExperience(String baseExperience) {
		this.baseExperience = baseExperience;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
