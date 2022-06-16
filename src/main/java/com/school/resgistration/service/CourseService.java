package com.school.resgistration.service;

import com.school.resgistration.repository.CourseRepository;
import com.school.resgistration.repository.entity.CourseEntity;
import com.school.resgistration.service.mapper.CourseMapper;
import com.school.resgistration.service.model.CourseDTO;

import java.util.List;

/**
 * @author German Magana
 */
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    /**
     * This method save a course
     *
     * @param courseDTO
     * @return
     */
    public CourseDTO save(CourseDTO courseDTO) {
        CourseEntity courseEntity = courseRepository.save(CourseMapper.INSTANCE.to(courseDTO));
        return CourseMapper.INSTANCE.from(courseEntity);
    }

    /**
     * This Method fetches all the courses
     *
     * @return
     */
    public List<CourseDTO> findAll() {

        return CourseMapper.INSTANCE.fromList(courseRepository.findAll());
    }

    /**
     * This method delete a course
     *
     * @param courseDTO
     * @return
     */
    public void delete(CourseDTO courseDTO) {
        courseRepository.delete(CourseMapper.INSTANCE.to(courseDTO));
    }


}
