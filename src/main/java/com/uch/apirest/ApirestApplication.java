// Define el paquete en el que se encuentra la clase
package com.uch.apirest;

// Importa las clases necesarias de Spring Boot para inicializar y configurar la aplicación
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotación que combina @Configuration, @EnableAutoConfiguration y @ComponentScan
// Configura la aplicación como una aplicación Spring Boot
@SpringBootApplication
public class ApirestApplication {

	// Método principal que actúa como punto de entrada de la aplicación
	public static void main(String[] args) {
		// Ejecuta la aplicación Spring Boot, inicializando el contexto de Spring
		SpringApplication.run(ApirestApplication.class, args);
	}
}


