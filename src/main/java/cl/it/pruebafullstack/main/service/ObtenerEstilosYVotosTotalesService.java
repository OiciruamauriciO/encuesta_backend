package cl.it.pruebafullstack.main.service;

import java.util.List;

import cl.it.pruebafullstack.main.domain.ResponseEstiloYVotosDto;

public interface ObtenerEstilosYVotosTotalesService {
	List<ResponseEstiloYVotosDto> getAllEstilosYVotos();
} 
