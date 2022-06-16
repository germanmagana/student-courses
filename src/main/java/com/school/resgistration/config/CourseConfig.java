package com.school.resgistration.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.school.resgistration.controller.CourseController;
import com.school.resgistration.repository.CourseRepository;
import com.school.resgistration.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author German Magana
 */
@Configuration
public class CourseConfig {


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

    @Bean
    public InternalResourceViewResolver defaultViewResolver() {
        return new InternalResourceViewResolver();
    }
}
