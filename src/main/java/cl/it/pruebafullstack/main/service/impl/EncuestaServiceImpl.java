package cl.it.pruebafullstack.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.it.pruebafullstack.main.domain.ResponseEncuestaDto;
import cl.it.pruebafullstack.main.entity.Encuesta;
import cl.it.pruebafullstack.main.repository.EncuestaRepository;
import cl.it.pruebafullstack.main.service.EncuestaService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EncuestaServiceImpl implements EncuestaService {
	
	@Autowired
	EncuestaRepository encuestaRepository;

	@Override
	public List<ResponseEncuestaDto> getAllEncuesta() {		
		
		List<Encuesta> resultado = new ArrayList<>();
		List<ResponseEncuestaDto> mapeoResultado = new ArrayList<>();
		
		try {
			resultado = this.encuestaRepository.findAll();

			for(int i=0; i<resultado.size(); i++) {
				ResponseEncuestaDto temporalResponseEncuestaDto = new ResponseEncuestaDto();
				temporalResponseEncuestaDto.setCorreo(resultado.get(i).getCorreo());
				temporalResponseEncuestaDto.setEstilo(resultado.get(i).getEstilo());
				temporalResponseEncuestaDto.setIdEncuesta(resultado.get(i).getIdEncuesta());
				mapeoResultado.add(temporalResponseEncuestaDto);
			}
		} catch(Exception e) {
			log.error(e.getMessage(), e);
		}

					
		return mapeoResultado;
	}	
	
	

}
