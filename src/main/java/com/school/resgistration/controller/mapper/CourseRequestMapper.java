package com.school.resgistration.controller.mapper;

import com.school.resgistration.controller.model.CourseRequest;
import com.school.resgistration.controller.model.CourseResponse;
import com.school.resgistration.service.model.CourseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseRequestMapper {

    public static CourseRequestMapper INSTANCE = Mappers.getMapper(CourseRequestMapper.class);

    public CourseDTO to(CourseRequest courseRequest);
    public CourseResponse from(CourseDTO courseDTO);
}
