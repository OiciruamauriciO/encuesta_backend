package cl.it.pruebafullstack.main;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EncuestaBackendApplicationTests {
	@Test
	@DisplayName(":::: Test no test (test para validar configuración)::::")
	void testNoTest() throws Exception {
		log.info("Validación de existencia de test");
		assertTrue(true);	
	}
}
