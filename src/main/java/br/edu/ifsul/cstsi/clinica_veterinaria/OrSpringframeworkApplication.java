package br.edu.ifsul.cstsi.clinica_veterinaria;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class OrSpringframeworkApplication {

    public static void main(String[] args) {

        SpringApplication.run(OrSpringframeworkApplication.class, args);
        ControllerVeterinaria.main(null);
    }

}
