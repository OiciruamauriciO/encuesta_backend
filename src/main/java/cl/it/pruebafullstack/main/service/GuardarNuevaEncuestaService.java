package cl.it.pruebafullstack.main.service;

import cl.it.pruebafullstack.main.common.CreatedResponse;
import cl.it.pruebafullstack.main.domain.EncuestaNuevaDto;

public interface GuardarNuevaEncuestaService {
	CreatedResponse createNuevaEncuesta(EncuestaNuevaDto nuevaEncuesta);
}
