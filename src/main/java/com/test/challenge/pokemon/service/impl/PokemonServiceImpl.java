/*************************
 * 
 * 
 * PokemonServiceImpl.java
 *
 * Control de versiones:
 *
 * Version  Date                    By                  
 * -------  -------------------     ----------------   
 * 1.0      3 may. 2021		        Guillermo Ventura		 
 * 
 * Descripcion: Clase para manejo de la logica y consumo del api
 * 
 **************************/
package com.test.challenge.pokemon.service.impl;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.challenge.pokemon.bean.ResponseAbilitiesBean;
import com.test.challenge.pokemon.entity.Bitacora;
import com.test.challenge.pokemon.repository.IBitacoraRepository;
import com.test.challenge.pokemon.service.IPokemonService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * Descripcion: Clase para manejo de la logica y consumo del api
 *
 */
@Service
public class PokemonServiceImpl implements IPokemonService {

	private Logger LOG = LoggerFactory.getLogger(PokemonServiceImpl.class);

	/**instancia del restTemplate*/
	@Autowired
	private RestTemplate restTemplate;

	/**url del servicio de usuario*/
	@Value("${param.service.api}")
	private String urlApiPokemon; 

	@Autowired
	private IBitacoraRepository repositoryBitacora;

	/**
	 * Metodo para consumir el API de pokemon
	 * 
	 * @param namePokemon nombre del pokemon
	 * @param metodo metodo a realizar
	 * @return json
	 */
	@Override
	public String getAbilities(String namePokemon) {

		/**metodo para consultar el api*/
		ResponseAbilitiesBean response = consultarApi(namePokemon );
		String jsonResponse ="";

		/**mapper para convertir a json*/
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			jsonResponse = objectMapper.writeValueAsString(response.getAbilities());
			
			/**crean la bitacora*/
			Bitacora bitacora = new Bitacora();
			bitacora.setIp(Utils.newInstance().getIp());
			bitacora.setMetodo("getAbilities");
			
			/**guarda en la bitacora*/
			repositoryBitacora.save(bitacora);
			
		} catch (JsonProcessingException e) {
			LOG.error("Error al convertir abilities", e);
		}
		return jsonResponse;
	}

	/**
	 * Metodo para consumir el API
	 * 
	 * @param pokemon
	 * @return
	 */
	private ResponseAbilitiesBean consultarApi(String pokemon) {


		LOG.info("Init COnsultar Api");

		ResponseAbilitiesBean response= null;

		/**cabeceras de la peticion*/
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

		HttpEntity<?> request = new HttpEntity<Object>(headers);
		try {

			/**se realiza la peticion*/
			ResponseEntity<String> responsePeticion = restTemplate.exchange(urlApiPokemon,HttpMethod.GET,request,String.class,pokemon);

			if (responsePeticion.getStatusCode() == HttpStatus.OK) {

				/**convierte la peticion a bean*/
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
				response= objectMapper.readValue(responsePeticion.getBody(), ResponseAbilitiesBean.class);


				
				
			} else {
				LOG.info("Request Failed");

			}

		} catch (Exception e) {
			LOG.error("Error al consumir API", e);

		}


		return response;

	}

	@Override
	public Integer getBaseExperience(String namePokemon) {
		/**metodo para consultar el api*/
		ResponseAbilitiesBean response = consultarApi(namePokemon );
		
		/**crean la bitacora*/
		Bitacora bitacora = new Bitacora();
		bitacora.setIp(Utils.newInstance().getIp());
		bitacora.setMetodo("getBaseExperience");
		
		/**guarda en la bitacora*/
		repositoryBitacora.save(bitacora);

		return Integer.parseInt(response.getBaseExperience());
	}

	@Override
	public Integer getId(String namePokemon) {
		/**metodo para consultar el api*/
		ResponseAbilitiesBean response = consultarApi(namePokemon );
		

		/**crean la bitacora*/
		Bitacora bitacora = new Bitacora();
		bitacora.setIp(Utils.newInstance().getIp());
		bitacora.setMetodo("getId");
		
		/**guarda en la bitacora*/
		repositoryBitacora.save(bitacora);

		return response.getId();
	}

	@Override
	public String getLocationArea(String namePokemon) {
		/**metodo para consultar el api*/
		ResponseAbilitiesBean response = consultarApi(namePokemon );


		/**crean la bitacora*/
		Bitacora bitacora = new Bitacora();
		bitacora.setIp(Utils.newInstance().getIp());
		bitacora.setMetodo("getLocationArea");
		
		/**guarda en la bitacora*/
		repositoryBitacora.save(bitacora);
		
		return response.getLocation();
	}
	
	

}
