package cl.it.pruebafullstack.main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import cl.it.pruebafullstack.main.entity.EncuestaEstilo;

public interface EncuestaEstiloRepository extends JpaRepository<EncuestaEstilo, Long>{

	@Query(nativeQuery = true,value = "SELECT MAX(ee.id_encuesta_estilo) FROM encuesta_estilo ee")
	Integer ultimoIdEncuestaEstilo();
	
	@Transactional
	@Modifying 
	@Query(nativeQuery = true,value = "INSERT INTO encuesta_estilo (encuesta_estilo_idencuesta, encuesta_estilo_idestilo) VALUES (?1, ?2)")
	void insertarNuevoEstiloEncuesta(Integer estilo, Integer tipo);

}
