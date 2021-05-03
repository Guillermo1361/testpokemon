package com.test.challenge.pokemon;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;

import localhost._8081.service.GetAbilities;
import localhost._8081.service.GetAbilitiesRequest;
import localhost._8081.service.GetBaseExperience;
import localhost._8081.service.GetBaseExperienceRequest;
import localhost._8081.service.GetId;
import localhost._8081.service.GetIdRequest;
import localhost._8081.service.GetLocation;
import localhost._8081.service.GetLocationRequest;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TestChallengePokemonApplicationTests {
	private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	
	@LocalServerPort
	private int port = 0;

	
	@BeforeEach
	public void init() throws Exception {
		marshaller.setPackagesToScan(ClassUtils.getPackageName(GetBaseExperienceRequest.class));
		marshaller.afterPropertiesSet();
	}

	@Test
	public void testSendGetBaseExperience() {
		
		GetBaseExperience value = new GetBaseExperience();
		value.setNombre("pikachu");
		
		WebServiceTemplate ws = new WebServiceTemplate(marshaller);
		GetBaseExperienceRequest request = new GetBaseExperienceRequest();
		request.setPokemon(value);

		assertThat(ws.marshalSendAndReceive("http://localhost:"
				+ port + "/ws", request) != null);
    }

	@Test
	public void testSendId() {
		
		GetId value = new GetId();
		value.setNombre("pikachu");
		
		WebServiceTemplate ws = new WebServiceTemplate(marshaller);
		GetIdRequest request = new GetIdRequest();
		request.setPokemon(value);

		assertThat(ws.marshalSendAndReceive("http://localhost:"
				+ port + "/ws", request) != null);
    }
	
	@Test
	public void testSendAbilities() {
		
		GetAbilities value = new GetAbilities();
		value.setNombre("pikachu");
		
		WebServiceTemplate ws = new WebServiceTemplate(marshaller);
		GetAbilitiesRequest request = new GetAbilitiesRequest();
		request.setPokemon(value);

		assertThat(ws.marshalSendAndReceive("http://localhost:"
				+ port + "/ws", request) != null);
    }
	
	@Test
	public void testSendLocation() {
		
		GetLocation value = new GetLocation();
		value.setNombre("pikachu");
		
		WebServiceTemplate ws = new WebServiceTemplate(marshaller);
		GetLocationRequest request = new GetLocationRequest();
		request.setPokemon(value);

		assertThat(ws.marshalSendAndReceive("http://localhost:"
				+ port + "/ws", request) != null);
    }


}
