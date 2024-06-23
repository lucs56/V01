// Define el paquete en el que se encuentra la clase
package com.uch.apirest.controller;

// Importa las anotaciones necesarias de Spring para crear controladores y manejar solicitudes HTTP
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Indica que esta clase es un controlador REST de Spring
@RestController
public class HelloController {

    // Mapea las solicitudes GET a la URL "/hello" al método sayHello
    @GetMapping("/hello")
    public String sayHello() {
        // Retorna un saludo como respuesta a la solicitud
        return "Hola profe!";
    }

    // Mapea las solicitudes GET a la URL "/car" al método getCarBrands
    @GetMapping("/car")
    public String[] getCarBrands() {
        // Define un arreglo de marcas de autos
        String[] carBrands = {"Toyota", "Honda", "Ford", "Chevrolet", "BMW"};
        // Retorna el arreglo de marcas de autos como respuesta a la solicitud
        return carBrands;
    }
}

