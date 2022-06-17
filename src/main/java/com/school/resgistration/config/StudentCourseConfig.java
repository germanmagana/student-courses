package com.school.resgistration.config;

import com.school.resgistration.repository.CourseRepository;
import com.school.resgistration.repository.StudentCourseRepository;
import com.school.resgistration.repository.StudentRepository;
import com.school.resgistration.service.StudentCourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentCourseConfig {

    @Bean
    public StudentCourseService studentCourseService(
        StudentCourseRepository studentCourseRepository, StudentRepository studentRepository,
        CourseRepository courseRepository){
        return new StudentCourseService(studentCourseRepository,studentRepository,courseRepository);
    }
}
