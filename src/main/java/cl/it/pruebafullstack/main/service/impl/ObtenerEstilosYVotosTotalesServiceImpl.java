package cl.it.pruebafullstack.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.it.pruebafullstack.main.domain.ResponseEstiloYVotosDto;
import cl.it.pruebafullstack.main.entity.Estilo;
import cl.it.pruebafullstack.main.repository.EstiloRepository;
import cl.it.pruebafullstack.main.service.ObtenerEstilosYVotosTotalesService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ObtenerEstilosYVotosTotalesServiceImpl implements ObtenerEstilosYVotosTotalesService {
	@Autowired
	EstiloRepository estiloRepository;
	
	@Override
	public List<ResponseEstiloYVotosDto> getAllEstilosYVotos() {
		
		List<Estilo> resultado = new ArrayList<>();
		List<ResponseEstiloYVotosDto> mapeoResultado = new ArrayList<>();
		
		try {			
			resultado = this.estiloRepository.findAll();
			for(int i=0; i<resultado.size(); i++) {
				ResponseEstiloYVotosDto temporalResponseEstiloDto = new ResponseEstiloYVotosDto();
				temporalResponseEstiloDto.setNombreEstilo(resultado.get(i).getNombre());
				temporalResponseEstiloDto.setTotalVotosPorEstilo(resultado.get(i).getVotos());
				mapeoResultado.add(temporalResponseEstiloDto);
			}
			
		} catch(Exception e) {
			log.error(e.getMessage(), e);
		}

					
		return mapeoResultado;
	}

}
