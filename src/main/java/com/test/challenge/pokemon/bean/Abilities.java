/*************************
 * 
 * 
 * Abilities.java
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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author AGODESA10
 *
 */
public class Abilities implements Serializable{
	
	
	
	/**
	 * serial id
	 */
	private static final long serialVersionUID = -7318596764838276051L;

	private Ability ability;
	
	@JsonProperty("is_hidden")
	private Boolean isHidden;
	
	private Integer slot;

	/**
	 * @return the ability
	 */
	public Ability getAbility() {
		return ability;
	}

	/**
	 * @param ability the ability to set
	 */
	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	/**
	 * @return the isHidden
	 */
	public Boolean getIsHidden() {
		return isHidden;
	}

	/**
	 * @param isHidden the isHidden to set
	 */
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * @return the slot
	 */
	public Integer getSlot() {
		return slot;
	}

	/**
	 * @param slot the slot to set
	 */
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	
	

}
