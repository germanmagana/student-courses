package com.school.resgistration.service.model;

import com.school.resgistration.repository.entity.CourseEntity;
import com.school.resgistration.repository.entity.StudentEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentCourseDTO {

    private long          studentCourseId;
    private  StudentEntity studentEntity;
    private  CourseEntity  courseEntity;
}
