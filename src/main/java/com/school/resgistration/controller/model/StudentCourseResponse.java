package com.school.resgistration.controller.model;

import com.school.resgistration.repository.entity.CourseEntity;
import com.school.resgistration.repository.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class StudentCourseResponse {

    private long          studentCourseId;
    private  StudentEntity studentEntity;
    private  CourseEntity  courseEntity;

    public StudentCourseResponse() {
    }
}
