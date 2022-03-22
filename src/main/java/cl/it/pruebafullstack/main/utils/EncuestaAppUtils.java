package cl.it.pruebafullstack.main.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class EncuestaAppUtils {

	private EncuestaAppUtils() {
		throw new IllegalStateException("Utility class");
	}
	
    public static LocalDateTime getLocalTime() {
        return LocalDateTime.now(ZoneId.of("Chile/Continental"));
    }
    
    public static String localDateTimeToDateWithSlash(LocalDateTime localDateTime) {
		return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(localDateTime);
    }
}
