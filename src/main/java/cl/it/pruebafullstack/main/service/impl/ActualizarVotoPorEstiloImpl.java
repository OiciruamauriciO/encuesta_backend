package cl.it.pruebafullstack.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.it.pruebafullstack.main.common.CreatedResponse;
import cl.it.pruebafullstack.main.entity.Estilo;
import cl.it.pruebafullstack.main.repository.EstiloRepository;
import cl.it.pruebafullstack.main.service.ActualizarVotoPorEstilo;
import cl.it.pruebafullstack.main.service.ObtenerEstiloPorId;
import cl.it.pruebafullstack.main.service.ObtenerVotoPorEstilo;
import cl.it.pruebafullstack.main.utils.EncuestaAppUtils;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ActualizarVotoPorEstiloImpl implements ActualizarVotoPorEstilo{
	
	@Autowired
	EstiloRepository estiloRepository;
	
	@Autowired
	ObtenerEstiloPorId obtenerEstiloPorId;
	
	@Autowired
	ObtenerVotoPorEstilo obtenerVotoPorEstilo;

	@Override
	public CreatedResponse actualizarVotoPorEstilo(Integer idestilo) {
		CreatedResponse response = new CreatedResponse(0L, EncuestaAppUtils.getLocalTime());
		Integer voto = -1;
		try {
			voto = this.obtenerVotoPorEstilo.getVotosPorEstilo(idestilo);
			log.info("VOTO ACTUAL DEL ESTILO");
			log.info(String.valueOf(voto));
			Estilo estilo = this.obtenerEstiloPorId.obtenerEstiloPorId(idestilo);
			estilo.setVotos(voto+1);
			this.estiloRepository.save(estilo);
			response.setId(1L);
			response.setFechaRegistro(EncuestaAppUtils.getLocalTime());
		} catch(Exception e) {
			log.info(e.getMessage(), e);
		}
		return response;
	}

}
