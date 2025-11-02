package API_PIZZARIA.demo;

/*
Responsável: Robert
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    // inicia o projeto Spring Boot
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("API da Pizzaria rodando...");
    }
}
