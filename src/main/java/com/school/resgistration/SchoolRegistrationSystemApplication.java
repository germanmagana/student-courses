package com.school.resgistration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author German Magana
 */
@OpenAPIDefinition
@SpringBootApplication
public class SchoolRegistrationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolRegistrationSystemApplication.class, args);
    }

}
