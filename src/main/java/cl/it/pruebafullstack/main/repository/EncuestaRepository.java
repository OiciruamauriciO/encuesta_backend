package cl.it.pruebafullstack.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.it.pruebafullstack.main.entity.Encuesta;

public interface EncuestaRepository extends JpaRepository<Encuesta, Long>{
	
	@Query(nativeQuery = true,value = "SELECT MAX(t.idencuesta) FROM encuesta t")
	Integer obtenerUltimoIdEncuesta();
}
