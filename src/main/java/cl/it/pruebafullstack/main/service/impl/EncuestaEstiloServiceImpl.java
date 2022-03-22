package cl.it.pruebafullstack.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.it.pruebafullstack.main.common.CreatedResponse;
import cl.it.pruebafullstack.main.domain.EncuestaEstiloNuevaDto;
import cl.it.pruebafullstack.main.repository.EncuestaEstiloRepository;
import cl.it.pruebafullstack.main.repository.EncuestaRepository;
import cl.it.pruebafullstack.main.service.EncuestaEstiloService;
import cl.it.pruebafullstack.main.utils.EncuestaAppUtils;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EncuestaEstiloServiceImpl implements EncuestaEstiloService {
	
	@Autowired
	EncuestaEstiloRepository encuestaEstiloRepository;
	
	@Autowired
	EncuestaRepository encuestaRepository;

	@Override
	public CreatedResponse createNuevaEncuestaEstilo(Integer fkEncuestaEstiloEncuesta, Integer fkEncuestaEstiloEstilo) {		
		log.info("::: EncuestaEstiloServiceImpl ::: createNuevaEncuestaEstilo ::: Inicio");		
		Integer idEncuestaEstilo = -1;
		CreatedResponse responseNuevaEncuestaEstilo = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		EncuestaEstiloNuevaDto encuestaEstiloNuevaDto = new EncuestaEstiloNuevaDto();
		encuestaEstiloNuevaDto.setEstilo(fkEncuestaEstiloEncuesta);
		encuestaEstiloNuevaDto.setTipo(fkEncuestaEstiloEstilo);
		try {
			idEncuestaEstilo = this.encuestaEstiloRepository.ultimoIdEncuestaEstilo();
			log.info("::: EncuestaEstiloServiceImpl ::: createNuevaEncuestaEstilo ::: MAX ID :::");
			log.info(String.valueOf(idEncuestaEstilo));	
			this.encuestaEstiloRepository.insertarNuevoEstiloEncuesta(encuestaEstiloNuevaDto.getEstilo(), encuestaEstiloNuevaDto.getTipo());
			responseNuevaEncuestaEstilo.setId(1L);
			responseNuevaEncuestaEstilo.setFechaRegistro(EncuestaAppUtils.getLocalTime());
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
		
		return responseNuevaEncuestaEstilo;
	}

}
