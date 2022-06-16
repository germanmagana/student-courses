package com.school.resgistration.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class CourseRequest {

    private long courseId;
    @NotNull
    private String courseName;
    @NotNull
    private String description;
    @NotNull
    private boolean enable;

    public CourseRequest() {
    }
}
