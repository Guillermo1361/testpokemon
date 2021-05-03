/*************************
 * 
 * 
 * Utils.java
 *
 * Control de versiones:
 *
 * Version  Date                    By                  
 * -------  -------------------     ----------------   
 * 1.0      3 may. 2021		        Guillermo Ventura		 
 * 
 * Descripcion: Clase de utileria
 * 
 **************************/
package com.test.challenge.pokemon.service.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * @author AGODESA10
 *
 */
public class Utils {

	private static Utils instance;

	/**
	 * Metodo para crear instancia
	 * @return instancia
	 */
	public static Utils newInstance() {

		if(instance==null) {
			instance = new Utils();
		}

		return instance;

	}

	

	/**
	 * Metodo para obtener IP
	 * @return
	 */
	public String getIp() {
		
		String ipStr="";
		try {
			InetAddress ip = InetAddress.getLocalHost();
			ipStr = ip.getHostAddress().toString();
			
			System.out.println("-------------" + ipStr);

		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		
		return ipStr;
	}
}
