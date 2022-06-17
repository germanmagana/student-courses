package com.school.resgistration.controller.model;

import com.school.resgistration.repository.entity.CourseEntity;
import com.school.resgistration.repository.entity.StudentEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentCourseResponse {

    private long          studentCourseId;
    private  StudentEntity studentEntity;
    private  CourseEntity  courseEntity;
}
