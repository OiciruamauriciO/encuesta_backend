package cl.it.pruebafullstack.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.it.pruebafullstack.main.entity.Estilo;

public interface EstiloRepository extends JpaRepository<Estilo, Long>{

    @Query(nativeQuery = false,value = "SELECT p.votos FROM Estilo p WHERE idestilo = ?1")
	Integer findByVotos(Integer idestilo); 

    @Query(nativeQuery = true,value = "SELECT t.idestilo, t.tipo, t.nombre, t.votos FROM Estilo t WHERE t.idestilo = ?1")
    Estilo encontrarEstilo(Integer idestilo);
}
	