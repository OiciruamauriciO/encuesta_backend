package cl.it.pruebafullstack.main.service;

import cl.it.pruebafullstack.main.common.CreatedResponse;

public interface EncuestaEstiloService {
	CreatedResponse createNuevaEncuestaEstilo(Integer fkEncuestaEstiloEncuesta, Integer fkEncuestaEstiloEstilo);
}
