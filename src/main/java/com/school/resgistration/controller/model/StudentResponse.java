package com.school.resgistration.controller.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse {

    private long studentId;
    private String name;
    private boolean enable;
}
