/*************************
 * 
 * 
 * Ability.java
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

/**
 * @author AGODESA10
 *
 */
public class Ability implements Serializable{
	
	
	
	/**
	 * Serial Id
	 */
	private static final long serialVersionUID = -1724046349935906278L;

	private String name;
	
	private String url;

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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
