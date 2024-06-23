// Define el paquete en el que se encuentra la clase
package com.uch.apirest;

// Importa las clases necesarias de Spring para inicializar una aplicación Servlet y configurar la aplicación Spring Boot
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// Define una clase que extiende SpringBootServletInitializer para configurar la aplicación cuando se despliega en un contenedor Servlet
public class ServletInitializer extends SpringBootServletInitializer {

	// Sobrescribe el método configure para especificar la clase principal de la aplicación Spring Boot
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// Configura la aplicación especificando la clase principal ApirestApplication
		return application.sources(ApirestApplication.class);
	}

}

