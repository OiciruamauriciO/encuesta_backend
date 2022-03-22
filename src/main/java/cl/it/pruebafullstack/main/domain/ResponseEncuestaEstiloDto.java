package cl.it.pruebafullstack.main.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEncuestaEstiloDto {

	Integer idEncuestaEstilo;
	Integer tipo;
	Integer estilo;
    LocalDateTime fechaRegistro;
}
