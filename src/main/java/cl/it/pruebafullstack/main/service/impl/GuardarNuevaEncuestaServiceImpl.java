package cl.it.pruebafullstack.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.it.pruebafullstack.main.common.CreatedResponse;
import cl.it.pruebafullstack.main.domain.EncuestaNuevaDto;
import cl.it.pruebafullstack.main.entity.Encuesta;
import cl.it.pruebafullstack.main.repository.EncuestaRepository;
import cl.it.pruebafullstack.main.service.GuardarNuevaEncuestaService;
import cl.it.pruebafullstack.main.utils.EncuestaAppUtils;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GuardarNuevaEncuestaServiceImpl implements GuardarNuevaEncuestaService{
	
	@Autowired
	EncuestaRepository encuestaRepository;

	@Override
	public CreatedResponse createNuevaEncuesta(EncuestaNuevaDto nuevaEncuesta) {
		
		CreatedResponse responseNuevaEncuesta = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		Encuesta encuesta = new Encuesta();
		encuesta.setCorreo(nuevaEncuesta.getCorreo());
		encuesta.setEstilo(nuevaEncuesta.getEstilo());
		
		try {
			this.encuestaRepository.save(encuesta);
			responseNuevaEncuesta.setId(1L);
			responseNuevaEncuesta.setFechaRegistro(EncuestaAppUtils.getLocalTime());
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
				
		return responseNuevaEncuesta;
	}

}
