package cl.it.pruebafullstack.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.it.pruebafullstack.main.domain.ResponseEstiloDto;
import cl.it.pruebafullstack.main.entity.Estilo;
import cl.it.pruebafullstack.main.service.EstiloService;
import cl.it.pruebafullstack.main.service.ObtenerEstiloPorId;
import cl.it.pruebafullstack.main.service.ObtenerVotoPorEstilo;

@RestController
@RequestMapping(value = "api/estilos")	
public class EstiloController {
	
	@Autowired
	EstiloService estiloService;
	
	@Autowired
	ObtenerVotoPorEstilo obtenerVotoPorEstilo;
	
	@Autowired
	ObtenerEstiloPorId obtenerEstiloPorId;
	
	@GetMapping(value = "/todos", produces = "application/json")
	public List<ResponseEstiloDto> getAllEstilos() {
		return this.estiloService.getAllEstilos();	
	} 
	
	@GetMapping(value = "/votos", produces = "application/json")
	public Integer getVotoPorEstilo(@RequestParam(required = true) Integer estilo) {
		return this.obtenerVotoPorEstilo.getVotosPorEstilo(estilo);
	}
	
	@GetMapping(value = "/id", produces = "application/json")
	public Estilo getEstiloPorId(@RequestParam(required = true)  Integer estilo) {		
		return this.obtenerEstiloPorId.obtenerEstiloPorId(estilo);	
	} 

}
