package cl.it.pruebafullstack.main.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.it.pruebafullstack.main.common.CreatedResponse;
import cl.it.pruebafullstack.main.domain.EncuestaNuevaDto;
import cl.it.pruebafullstack.main.entity.Encuesta;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class GuardarNuevaEncuestaServiceImplTests {
	
	@Autowired
	GuardarNuevaEncuestaServiceImpl guardarNuevaEncuestaServiceImplTest;
	
	@Test
	@DisplayName(value="Test para guardar una encuesta, cuando el correo y el estilo son correctos")
	public void guardarNuevaEncuestaTest001() {		
		Encuesta encuesta = new Encuesta();
		encuesta.setCorreo("correo@correo.com");
		encuesta.setEstilo(1);	
		EncuestaNuevaDto nuevaEncuesta = new EncuestaNuevaDto();
		nuevaEncuesta.setCorreo(encuesta.getCorreo());
		nuevaEncuesta.setEstilo(encuesta.getEstilo());
		try {
			CreatedResponse responseNuevaEncuesta = this.guardarNuevaEncuestaServiceImplTest.createNuevaEncuesta(nuevaEncuesta);
			assertNotEquals(0, responseNuevaEncuesta.getId());
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}	

	@Test
	@DisplayName(value="Test para guardar una encuesta, cuando el correo es correcto y el estilo es incorrecto")
	public void guardarNuevaEncuestaTest002() {		
		Encuesta encuesta = new Encuesta();
		encuesta.setCorreo("correo@correo.com");
		encuesta.setEstilo(-1);	
		EncuestaNuevaDto nuevaEncuesta = new EncuestaNuevaDto();
		nuevaEncuesta.setCorreo(encuesta.getCorreo());
		nuevaEncuesta.setEstilo(encuesta.getEstilo());
		try {
			CreatedResponse responseNuevaEncuesta = this.guardarNuevaEncuestaServiceImplTest.createNuevaEncuesta(nuevaEncuesta);
			assertEquals(1, responseNuevaEncuesta.getId());//devuelve 1, es decir permite el ingreso de un valor negativo, debe regularizarse y plantearse la lógica que restringa el ingreso de un menos 1, a pesar que desde el front solo se puede seleccionar 1,2,3, no hay restricciones del rango del dato en el backend
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}
	
	@Test
	@DisplayName(value="Test para guardar una encuesta, cuando el correo y el estilo, son incorrectos")
	public void guardarNuevaEncuestaTest003() {		
		Encuesta encuesta = new Encuesta();
		encuesta.setCorreo("correo@correo");
		encuesta.setEstilo(-1);	
		EncuestaNuevaDto nuevaEncuesta = new EncuestaNuevaDto();
		nuevaEncuesta.setCorreo(encuesta.getCorreo());
		nuevaEncuesta.setEstilo(encuesta.getEstilo());
		try {
			CreatedResponse responseNuevaEncuesta = this.guardarNuevaEncuestaServiceImplTest.createNuevaEncuesta(nuevaEncuesta);
			assertEquals(1, responseNuevaEncuesta.getId());//devuelve 1, es decir permite el ingreso de un valor negativo, debe regularizarse y plantearse la lógica que restringa el ingreso de un menos 1, a pesar que desde el front solo se puede seleccionar 1,2,3, no hay restricciones del rango del dato en el backend. Además no controla el dominio del correo, dede el front solo se controla el @
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}	
}
