package com.school.resgistration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SecurityScheme(name = "Student-Course", scheme = "basic",
                type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
@OpenAPIDefinition(info = @Info(title = "Student-Course API", version = "2.0",
                                description = "Student-Course Information"))

public class SchoolRegistrationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolRegistrationSystemApplication.class, args);
    }

}
