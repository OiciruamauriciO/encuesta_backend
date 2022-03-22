package cl.it.pruebafullstack.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.it.pruebafullstack.main.common.CreatedResponse;
import cl.it.pruebafullstack.main.domain.ResponseEstiloYVotosDto;
import cl.it.pruebafullstack.main.service.ActualizarVotoPorEstilo;
import cl.it.pruebafullstack.main.service.ObtenerEstilosYVotosTotalesService;

@RestController
@RequestMapping(value = "api/resultados")	
public class EstiloYVotosController {
	
	@Autowired
	ObtenerEstilosYVotosTotalesService obtenerEstilosYVotosTotalesService;
	
	@Autowired
	ActualizarVotoPorEstilo actualizarVotoPorEstilo;
	
	@GetMapping(value = "/todos", produces = "application/json")
	public List<ResponseEstiloYVotosDto> getAllEstilosYVotos() {
		return this.obtenerEstilosYVotosTotalesService.getAllEstilosYVotos();		
	} 
	
	@PostMapping(value = "/updateVoto", produces = "application/json")
	public @ResponseBody ResponseEntity<CreatedResponse> updateVotoEstilo(@RequestParam(required = true) Integer estilo) {
		return new ResponseEntity<>(this.actualizarVotoPorEstilo.actualizarVotoPorEstilo(estilo), HttpStatus.OK);	
	}

}
