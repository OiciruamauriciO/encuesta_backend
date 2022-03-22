package cl.it.pruebafullstack.main.service.impl;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.it.pruebafullstack.main.domain.ResponseEstiloDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EstiloServiceImplTests {
	
	@Autowired
	EstiloServiceImpl estiloServiceImplTest;
	
	@Test
	@DisplayName(value="::: Test para validar el retorno de la entidad estilo, cuando es correcto o esperado el tipo estilo  :::")
	public void getAllEstilosTest001() {		
		List<ResponseEstiloDto> resultado = new ArrayList<>();				
		try {			
			resultado = this.estiloServiceImplTest.getAllEstilos();
			assertNotNull(resultado);			
		}catch(Exception e){
			log.info(e.getMessage(), e);
		}
	}

}
