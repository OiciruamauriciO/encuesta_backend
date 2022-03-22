package cl.it.pruebafullstack.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.it.pruebafullstack.main.entity.Estilo;
import cl.it.pruebafullstack.main.repository.EstiloRepository;
import cl.it.pruebafullstack.main.service.ObtenerEstiloPorId;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ObtenerEstiloPorIdImpl implements ObtenerEstiloPorId{
	
	@Autowired
	EstiloRepository estiloRepository;

	@Override
	public Estilo obtenerEstiloPorId(Integer idestilo) {

		Estilo estilo = new Estilo();
		
		try {
			
			estilo = this.estiloRepository.encontrarEstilo(idestilo);
			log.info("ESTILO ENCONTRADO");
			log.info(estilo.getNombre());
			log.info(String.valueOf(estilo.getTipo()));
			log.info(String.valueOf(estilo.getVotos()));
			log.info(String.valueOf(estilo.getIdEstilo()));
			
		} catch(Exception e) {
			log.info(e.getMessage(), e);
		}
		
		return estilo;
	}

}
