package cl.it.pruebafullstack.main.service.impl;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.it.pruebafullstack.main.domain.ResponseEncuestaDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EncuestaServiceImplTests {
	
	@Autowired
	EncuestaServiceImpl encuestaServiceImplTest;

	@Test
	@DisplayName(value="::: Test para validar el retorno de la entidad encuesta, cuando es correcto o esperado el tipo encuesta  :::")
	public void getAllEncuestasTest001() {		
		List<ResponseEncuestaDto> resultado = new ArrayList<>();				
		try {			
			resultado = this.encuestaServiceImplTest.getAllEncuesta();
			assertNotNull(resultado);			
		}catch(Exception e){
			log.info(e.getMessage(), e);
		}
	}
}
