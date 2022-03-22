package cl.it.pruebafullstack.main.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.it.pruebafullstack.main.common.CreatedResponse;
import cl.it.pruebafullstack.main.domain.EncuestaEstiloNuevaDto;
import cl.it.pruebafullstack.main.utils.EncuestaAppUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EncuestaEstiloServiceImplTests {
	
	@Autowired
	EncuestaEstiloServiceImpl encuestaEstiloServiceImplTest;
	
	@Test
	@DisplayName(value="::: Test para validar la inserción de un nuevo elemento en la entidad encuesta_estilo cuando encuesta tiene un valor no esperado numérico :::")
	public void testEncuestaEstiloService001() {

		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		
		try {
			
			encuestaEstiloNuevaDto.setEstilo(-1);
			encuestaEstiloNuevaDto.setTipo(1);
			responseNuevaEncuestaEstilo = this.encuestaEstiloServiceImplTest.createNuevaEncuestaEstilo(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			assertEquals(0,responseNuevaEncuestaEstilo.getId());
			
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}
	
	@Test
	@DisplayName(value="::: Test para validar la inserción de un nuevo elemento en la entidad encuesta_estilo cuando encuesta tiene un valor esperado numérico:::")
	public void testEncuestaEstiloService002() {

		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		
		try {
			
			encuestaEstiloNuevaDto.setEstilo(1);
			encuestaEstiloNuevaDto.setTipo(1);
			responseNuevaEncuestaEstilo = this.encuestaEstiloServiceImplTest.createNuevaEncuestaEstilo(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			assertEquals(1,responseNuevaEncuestaEstilo.getId());
			
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}
	
	@Test
	@DisplayName(value="::: Test para validar la inserción de un nuevo elemento en la entidad encuesta_estilo cuando estilo tiene un valor no esperado numérico:::")
	public void testEncuestaEstiloService003() {

		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		
		try {
			
			encuestaEstiloNuevaDto.setEstilo(1);
			encuestaEstiloNuevaDto.setTipo(-1);
			responseNuevaEncuestaEstilo = this.encuestaEstiloServiceImplTest.createNuevaEncuestaEstilo(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			assertEquals(0,responseNuevaEncuestaEstilo.getId());
			
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}
	
	@Test
	@DisplayName(value="::: Test para validar la inserción de un nuevo elemento en la entidad encuesta_estilo cuando encuesta y estilo no tienen un valor esperado numérico:::")
	public void testEncuestaEstiloService004() {

		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		
		try {
			
			encuestaEstiloNuevaDto.setEstilo(-1);
			encuestaEstiloNuevaDto.setTipo(-1);
			responseNuevaEncuestaEstilo = this.encuestaEstiloServiceImplTest.createNuevaEncuestaEstilo(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			assertEquals(0,responseNuevaEncuestaEstilo.getId());
			
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}	
	
	@Test
	@DisplayName(value="::: Test para validar la inserción de un nuevo elemento en la entidad encuesta_estilo cuando encuesta es null y estilo es correcto :::")
	public void testEncuestaEstiloService005() {

		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		
		try {
			
			encuestaEstiloNuevaDto.setEstilo(null);
			encuestaEstiloNuevaDto.setTipo(1);
			responseNuevaEncuestaEstilo = this.encuestaEstiloServiceImplTest.createNuevaEncuestaEstilo(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			assertEquals(0,responseNuevaEncuestaEstilo.getId());
			
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}	
	
	@Test
	@DisplayName(value="::: Test para validar la inserción de un nuevo elemento en la entidad encuesta_estilo cuando encuesta es correcto y estilo es null :::")
	public void testEncuestaEstiloService006() {

		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		
		try {
			
			encuestaEstiloNuevaDto.setEstilo(1);
			encuestaEstiloNuevaDto.setTipo(null);
			responseNuevaEncuestaEstilo = this.encuestaEstiloServiceImplTest.createNuevaEncuestaEstilo(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			assertEquals(0,responseNuevaEncuestaEstilo.getId());
			
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}		
	
	@Test
	@DisplayName(value="::: Test para validar la inserción de un nuevo elemento en la entidad encuesta_estilo cuando encuesta es null y estilo es null :::")
	public void testEncuestaEstiloService007() {

		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		
		try {
			
			encuestaEstiloNuevaDto.setEstilo(null);
			encuestaEstiloNuevaDto.setTipo(null);
			responseNuevaEncuestaEstilo = this.encuestaEstiloServiceImplTest.createNuevaEncuestaEstilo(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			assertEquals(0,responseNuevaEncuestaEstilo.getId());
			
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}	
	
	@Test
	@DisplayName(value="::: Test para validar la inserción de un nuevo elemento en la entidad encuesta_estilo cuando encuesta es incorrecto y estilo es null :::")
	public void testEncuestaEstiloService008() {

		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		
		try {
			
			encuestaEstiloNuevaDto.setEstilo(-1);
			encuestaEstiloNuevaDto.setTipo(null);
			responseNuevaEncuestaEstilo = this.encuestaEstiloServiceImplTest.createNuevaEncuestaEstilo(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			assertEquals(0,responseNuevaEncuestaEstilo.getId());
			
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}
	
	@Test
	@DisplayName(value="::: Test para validar la inserción de un nuevo elemento en la entidad encuesta_estilo cuando encuesta es null y estilo es incorrecto :::")
	public void testEncuestaEstiloService009() {

		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		
		try {
			
			encuestaEstiloNuevaDto.setEstilo(null);
			encuestaEstiloNuevaDto.setTipo(-1);
			responseNuevaEncuestaEstilo = this.encuestaEstiloServiceImplTest.createNuevaEncuestaEstilo(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			assertEquals(0,responseNuevaEncuestaEstilo.getId());
			
		}catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}	
	

}
