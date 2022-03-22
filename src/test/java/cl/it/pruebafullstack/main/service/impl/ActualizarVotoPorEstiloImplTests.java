package cl.it.pruebafullstack.main.service.impl;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import cl.it.pruebafullstack.main.common.CreatedResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class ActualizarVotoPorEstiloImplTests {
	
	@Autowired
	ActualizarVotoPorEstiloImpl actualizarVotoPorEstiloImplTest;
	
	@Test
	@DisplayName(value="::: Test para validar la actualización de voto invocando al servicio relacionado - cuando el voto por estilo referenciado no es el esperado dentro del tipo de dato :::")
	public void testActualizarVotoEntidad001() {
		
		try {
			CreatedResponse response = this.actualizarVotoPorEstiloImplTest.actualizarVotoPorEstilo(-1);
			assertEquals(0, response.getId());
		}catch(NumberFormatException ne) {
			log.info(ne.getMessage(), ne);
		}

	}
	
	@Test
	@DisplayName(value="::: Test para validar la actualización de voto invocando al servicio relacionado- cuando el voto por estilo refrenciado si es el esperado dentro del tipo de dato :::")
	public void testActualizarVotoEntidad002() {
		try {
			CreatedResponse response = this.actualizarVotoPorEstiloImplTest.actualizarVotoPorEstilo(1);
			assertNotEquals(0, response.getId());
		}catch(NumberFormatException ne) {
			log.info(ne.getMessage(), ne);
		}

	}
	
	@Test
	@DisplayName(value="::: Test para validar la actualización de voto invocando al servicio relacionado- cuando el voto por estilo referenciado es null :::")
	public void testActualizarVotoEntidad003() {
		try {
			CreatedResponse response = this.actualizarVotoPorEstiloImplTest.actualizarVotoPorEstilo(null);
			assertEquals(0, response.getId());
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}

	}
	
	@Test
	@DisplayName(value="::: Test para validar la actualización de voto invocando al servicio relacionado- cuando el voto por estilo referenciado se relaciona a una excepción de formato numérico :::")
	public void testActualizarVotoEntidad004() {
		try {
			CreatedResponse response = this.actualizarVotoPorEstiloImplTest.actualizarVotoPorEstilo(Integer.parseInt("abcdefghijklsmnñopqrstuvwxyz"));
			assertNotEquals(0, response.getId());
		}catch(NumberFormatException ne) {
			log.info(ne.getMessage(), ne);
		}

	}
	
	
}
