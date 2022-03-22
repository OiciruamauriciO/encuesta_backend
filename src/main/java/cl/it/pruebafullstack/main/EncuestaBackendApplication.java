package cl.it.pruebafullstack.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EncuestaBackendApplication {
	    
	public static void main(String[] args) {
		SpringApplication.run(EncuestaBackendApplication.class, args);
	}
	
    @Value("${cors.allowed-origins}")
    private String allowedOriginsString;
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				log.info(allowedOriginsString);
				String[] allowedOrigins = allowedOriginsString.split(",");
				registry.addMapping("/**").allowedOrigins(allowedOrigins).allowedMethods("*").allowedHeaders("*");
			}
		};
	}

}
