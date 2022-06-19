package com.school.resgistration.service.mapper;

import com.school.resgistration.repository.entity.StudentCourseEntity;
import com.school.resgistration.repository.entity.StudentEntity;
import com.school.resgistration.service.model.StudentCourseDTO;
import com.school.resgistration.service.model.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentCourseMapper {

    public static StudentCourseMapper INSTANCE = Mappers.getMapper(StudentCourseMapper.class);
    public StudentCourseEntity to(StudentCourseDTO studentCourseDTO);
    public StudentCourseDTO from(StudentCourseEntity studentCourseEntity);
}
