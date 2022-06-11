package com.school.resgistration.controller.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseResponse {

    private long courseId;
    private String courseName;
    private boolean enable;
}
