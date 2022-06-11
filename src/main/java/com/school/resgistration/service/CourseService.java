package com.school.resgistration.service;

import com.school.resgistration.repository.CourseRepository;
import com.school.resgistration.repository.entity.CourseEntity;
import com.school.resgistration.service.mapper.CourseMapper;
import com.school.resgistration.service.model.CourseDTO;

public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseDTO save(CourseDTO courseDTO){
        CourseEntity courseEntity = courseRepository.save(CourseMapper.INSTANCE.to(courseDTO));
        return CourseMapper.INSTANCE.from(courseEntity);
    }
}
