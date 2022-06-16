package com.school.resgistration.controller.mapper;

import com.school.resgistration.controller.model.CourseRequest;
import com.school.resgistration.controller.model.CourseResponse;
import com.school.resgistration.service.model.CourseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CourseResponseMapper {

    public static CourseResponseMapper INSTANCE = Mappers.getMapper(CourseResponseMapper.class);

    public CourseDTO to(CourseResponse courseResponse);
    public CourseResponse from(CourseDTO courseDTO);
    public List<CourseResponse> fromList(List<CourseDTO> courseDTOs);

}
