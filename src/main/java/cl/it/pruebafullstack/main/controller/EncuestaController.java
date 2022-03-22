package cl.it.pruebafullstack.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import cl.it.pruebafullstack.main.service.EncuestaService;
import cl.it.pruebafullstack.main.service.GuardarNuevaEncuestaService;
import cl.it.pruebafullstack.main.common.CreatedResponse;
import cl.it.pruebafullstack.main.domain.EncuestaNuevaDto;
import cl.it.pruebafullstack.main.domain.ResponseEncuestaDto;
import cl.it.pruebafullstack.main.repository.EncuestaRepository;


//No es necesario realmente, pues se encarga JPA, de actulizar esta entidad con las relaciones foráneas 
@RestController
@RequestMapping(value = "api/encuestas")	
public class EncuestaController {
	
	@Autowired
	EncuestaRepository encuestaRepository;

	@Autowired
	EncuestaService encuestaService;
	
	@Autowired
	GuardarNuevaEncuestaService guardarNuevaEncuestaService;
	
	@GetMapping(value = "", produces = "application/json")
	public List<ResponseEncuestaDto> getAllEncuestas() {
		return this.encuestaService.getAllEncuesta();		
	}
	
	@GetMapping(value = "/idultimo", produces = "application/json")
	public Integer getIdUltimo() {
		return this.encuestaRepository.obtenerUltimoIdEncuesta();		
	} 
	
	@PostMapping(value = "", consumes = "application/json", produces = "application/json")
	public @ResponseBody ResponseEntity<CreatedResponse> createEncuestaNueva(@RequestBody EncuestaNuevaDto encuestaNuevaDto) {
		return new ResponseEntity<>(this.guardarNuevaEncuestaService.createNuevaEncuesta(encuestaNuevaDto), HttpStatus.CREATED);	
	}
}

