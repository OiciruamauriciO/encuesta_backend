package cl.it.pruebafullstack.main.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetResponse {

	private Object data;
	
	public GetResponse(Object data) {
		super();
		this.data = data;
	}
}
