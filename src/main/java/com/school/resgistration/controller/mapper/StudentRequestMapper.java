package com.school.resgistration.controller.mapper;

import com.school.resgistration.controller.model.CourseRequest;
import com.school.resgistration.controller.model.CourseResponse;
import com.school.resgistration.controller.model.StudentRequest;
import com.school.resgistration.controller.model.StudentResponse;
import com.school.resgistration.service.model.CourseDTO;
import com.school.resgistration.service.model.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentRequestMapper {

    public static StudentRequestMapper INSTANCE = Mappers.getMapper(StudentRequestMapper.class);

    public StudentDTO to(StudentRequest studentRequest);
    public StudentResponse from(StudentDTO studentDTO);
    public List<StudentResponse> fromList(List<StudentDTO> studentDTOList);
}
