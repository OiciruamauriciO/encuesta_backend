package cl.it.pruebafullstack.main.service.impl;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ObtenerVotoPorEstiloImplTests {
	
	@Autowired
	ObtenerVotoPorEstiloImpl obtenerVotoPorEstiloImplTest;
	
	@Test
	@DisplayName(value="Test para obtener el voto según el estilo, con el valor del tipo estilo, correcto")
	public void obtenerVotoPorEstiloTest001() {
		try {
			Integer voto = this.obtenerVotoPorEstiloImplTest.getVotosPorEstilo(1);
			assertNotEquals(-1, voto);
		} catch (Exception e){
			log.info(e.getMessage(), e);
		}
	}
	
	@Test
	@DisplayName(value="Test para obtener el voto según el estilo, con el valor del tipo estilo, incorrecto")
	public void obtenerVotoPorEstiloTest002() {
		try {
			Integer voto = this.obtenerVotoPorEstiloImplTest.getVotosPorEstilo(-1);
			assertEquals(-1, voto);
		} catch (Exception e){
			log.info(e.getMessage(), e);
		}
	}
}
