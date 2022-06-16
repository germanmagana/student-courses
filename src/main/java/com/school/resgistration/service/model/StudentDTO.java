package com.school.resgistration.service.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
public class StudentDTO {

    private long studentId;
    private String name;
    private boolean enable;
}
