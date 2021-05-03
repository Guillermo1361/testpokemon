/*************************
 * 
 * 
 * PokemonEndpoint.java
 *
 * Control de versiones:
 *
 * Version  Date                    By                  
 * -------  -------------------     ----------------   
 * 1.0      2 may. 2021		        Guillermo Ventura		 
 * 
 * Descripcion: EndPoint para el servicio
 * 
 **************************/
package com.test.challenge.pokemon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.test.challenge.pokemon.service.IPokemonService;

import localhost._8081.service.GetAbilitiesRequest;
import localhost._8081.service.GetAbilitiesResponse;
import localhost._8081.service.GetBaseExperienceRequest;
import localhost._8081.service.GetBaseExperienceResponse;
import localhost._8081.service.GetIdRequest;
import localhost._8081.service.GetIdResponse;
import localhost._8081.service.GetLocationRequest;
import localhost._8081.service.GetLocationResponse;


/**
 *   Descripcion: EndPoint para el servicio
 *
 */
@Endpoint
public class PokemonEndpoint {

	@Autowired
	private IPokemonService pokemonService;
	
	private static final String NAMESPACE_URI = "http://localhost:8081/service";


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAbilitiesRequest")
	@ResponsePayload
	public GetAbilitiesResponse getAbilitie(@RequestPayload GetAbilitiesRequest request) {
		GetAbilitiesResponse response = new GetAbilitiesResponse();
		
		
		
		String jsonStr = pokemonService.getAbilities(request.getPokemon().getNombre());
		
		response.setJson(jsonStr);

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBaseExperienceRequest")
	@ResponsePayload
	public GetBaseExperienceResponse getBaseExperience(@RequestPayload GetBaseExperienceRequest request) {
		GetBaseExperienceResponse response = new GetBaseExperienceResponse();
		
		Integer data = pokemonService.getBaseExperience(request.getPokemon().getNombre());
		
		response.setData(String.valueOf(data));

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getIdRequest")
	@ResponsePayload
	public GetIdResponse getId(@RequestPayload GetIdRequest request) {
		GetIdResponse response = new GetIdResponse();
		
		Integer data = pokemonService.getId(request.getPokemon().getNombre());
		
		response.setData(String.valueOf(data));

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocationRequest")
	@ResponsePayload
	public GetLocationResponse getLocation(@RequestPayload GetLocationRequest request) {
		GetLocationResponse response = new GetLocationResponse();
		
		String data = pokemonService.getLocationArea(request.getPokemon().getNombre());
		
		response.setData(data);

		return response;
	}
}
