package cl.it.pruebafullstack.main.common;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CreatedResponse {
	private Long id;
	private LocalDateTime fechaRegistro;
}
