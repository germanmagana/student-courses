package com.school.resgistration.service.mapper;

import com.school.resgistration.repository.entity.CourseEntity;
import com.school.resgistration.repository.entity.StudentEntity;
import com.school.resgistration.service.model.CourseDTO;
import com.school.resgistration.service.model.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {

    public static StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    public StudentEntity to(StudentDTO studentDTO);
    public List<StudentEntity> toList(List<StudentDTO> studentDTO);

    public StudentDTO from(StudentEntity studentEntity);
    public List<StudentDTO> fromList(List<StudentEntity> studentEntities);
}
