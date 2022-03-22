package cl.it.pruebafullstack.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.it.pruebafullstack.main.domain.ResponseEstiloDto;
import cl.it.pruebafullstack.main.entity.Estilo;
import cl.it.pruebafullstack.main.repository.EstiloRepository;
import cl.it.pruebafullstack.main.service.EstiloService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EstiloServiceImpl implements EstiloService {
	
	@Autowired
	EstiloRepository estiloRepository;

	@Override
	public List<ResponseEstiloDto> getAllEstilos() {
		
		List<Estilo> resultado = new ArrayList<>();		
		List<ResponseEstiloDto> mapeoResultado = new ArrayList<>();
		
		try {			
			resultado = this.estiloRepository.findAll();
			for(int i=0; i<resultado.size(); i++) {
				ResponseEstiloDto temporalResponseEstiloDto = new ResponseEstiloDto();
				temporalResponseEstiloDto.setIdEstilo(resultado.get(i).getIdEstilo());
				temporalResponseEstiloDto.setNombre(resultado.get(i).getNombre());
				temporalResponseEstiloDto.setVotos(resultado.get(i).getVotos());
				mapeoResultado.add(temporalResponseEstiloDto);
			}
			
		} catch(Exception e) {
			log.error(e.getMessage(), e);
		}

					
		return mapeoResultado;
	}

}
