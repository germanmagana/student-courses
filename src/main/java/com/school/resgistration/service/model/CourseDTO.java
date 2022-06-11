package com.school.resgistration.service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDTO {

    private long courseId;
    private String courseName;
    private boolean enable;
    private String description;

}
