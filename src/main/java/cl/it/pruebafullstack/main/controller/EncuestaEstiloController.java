package cl.it.pruebafullstack.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.it.pruebafullstack.main.common.CreatedResponse;
import cl.it.pruebafullstack.main.service.EncuestaEstiloService;

@RestController
@RequestMapping(value = "api/encuestasestilos")	
public class EncuestaEstiloController {
	
	@Autowired
	EncuestaEstiloService encuestaEstiloService;
	
	@PostMapping(value = "", consumes = "application/json", produces = "application/json")
	public @ResponseBody ResponseEntity<CreatedResponse> createNuevaEncuestaEstilo(@RequestParam Integer fkEncuestaEstiloEncuesta, @RequestParam Integer fkEncuestaEstiloEstilo) {
		return new ResponseEntity<>(this.encuestaEstiloService.createNuevaEncuestaEstilo(fkEncuestaEstiloEncuesta, fkEncuestaEstiloEstilo), HttpStatus.CREATED);	
	}

}
