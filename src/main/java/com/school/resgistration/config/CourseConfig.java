package com.school.resgistration.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.school.resgistration.controller.CourseController;
import com.school.resgistration.repository.CourseRepository;
import com.school.resgistration.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class CourseConfig {

    @Bean
    public CourseController courseController(CourseService courseService){

        return new CourseController(courseService);
    }

    @Bean
    public CourseService courseService(CourseRepository courseRepository){
        return new CourseService(courseRepository);
    }

    @Bean
    public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
        return new
            Jackson2ObjectMapperBuilder()
            .serializationInclusion(JsonInclude.Include.NON_NULL);
    }
}
