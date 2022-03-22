package cl.it.pruebafullstack.main.domain;

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
public class ResponseEstiloYVotosDto {
	String nombreEstilo;
	Integer totalVotosPorEstilo;
}
