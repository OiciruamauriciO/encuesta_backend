package cl.it.pruebafullstack.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.it.pruebafullstack.main.domain.ResponseEstiloYVotosDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ObtenerEstilosYVotosTotalesServiceImplTest {

	@Autowired
	ObtenerEstilosYVotosTotalesServiceImpl obtenerEstilosYVotosTotalesServiceImplTest;
	
	@Test
	@DisplayName(value="Test para retornar lista de estilos existentes")
	public void todosLosEstilosyVotosTest001() {
		List<ResponseEstiloYVotosDto> listaEstilosYVotos = new ArrayList<>();
		try {
			listaEstilosYVotos = this.obtenerEstilosYVotosTotalesServiceImplTest.getAllEstilosYVotos();
			assertNotEquals(0, listaEstilosYVotos.get(0).getTotalVotosPorEstilo());
		} catch(Exception e) {
			log.info(e.getMessage(), e);
		}
	}
}
