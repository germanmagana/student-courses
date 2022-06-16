package com.school.resgistration.service.mapper;

import com.school.resgistration.repository.entity.CourseEntity;
import com.school.resgistration.service.model.CourseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CourseMapper {

    public static CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    public CourseEntity to(CourseDTO courseDTO);
    public CourseDTO from(CourseEntity courseEntity);
    public List<CourseDTO> fromList(List<CourseEntity> courseEntities);
}
