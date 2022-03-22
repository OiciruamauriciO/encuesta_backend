package cl.it.pruebafullstack.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.it.pruebafullstack.main.repository.EstiloRepository;
import cl.it.pruebafullstack.main.service.ObtenerVotoPorEstilo;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ObtenerVotoPorEstiloImpl implements ObtenerVotoPorEstilo{
	
	@Autowired
	EstiloRepository estiloRepository;

	@Override
	public Integer getVotosPorEstilo(Integer idestilo) {
		Integer votos = -1;
		try {
			votos = this.estiloRepository.findByVotos(idestilo);
			log.info("EL VALOR DEL VOTO CONSULTADO ES");
			log.info(String.valueOf(votos));
			log.info("EL VALOR DEL ELEMENTO USADO PARA ENCONTRAR EL TOTAL DE VOTOS ES");
			log.info(String.valueOf(idestilo));
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
		
		return votos;
	}

}
