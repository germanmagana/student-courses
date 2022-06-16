package com.school.resgistration.config;

import com.school.resgistration.repository.StudentRepository;
import com.school.resgistration.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author German Magana
 */
@Configuration
public class StudentConfig {

    @Bean
    public StudentService studentService(StudentRepository studentRepository){
        return new StudentService(studentRepository);
    }
}
