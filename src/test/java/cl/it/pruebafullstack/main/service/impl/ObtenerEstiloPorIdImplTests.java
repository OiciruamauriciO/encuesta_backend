package cl.it.pruebafullstack.main.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.it.pruebafullstack.main.entity.Estilo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ObtenerEstiloPorIdImplTests {

	@Autowired
	ObtenerEstiloPorIdImpl obtenerEstiloPorIdImplTest;
	
	@Test
	@DisplayName(value="Test para retornar el estilo consultado por id, estilo en rango")
	public void obtenerEstiloPorIdTest001() {
		Estilo estilo = new Estilo();
		try {
			estilo = this.obtenerEstiloPorIdImplTest.obtenerEstiloPorId(1);
			assertNotEquals(0, estilo.getIdEstilo());
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
		
	}
	
	@Test
	@DisplayName(value="Test para retornar el estilo consultado por id, estilo fuera de rango")
	public void obtenerEstiloPorIdTest002() {
		Estilo estilo = new Estilo();
		try {
			estilo = this.obtenerEstiloPorIdImplTest.obtenerEstiloPorId(-1);
			assertEquals(0, estilo.getIdEstilo());
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
		
	}
}
