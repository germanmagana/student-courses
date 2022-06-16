package com.school.resgistration.controller.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class StudentRequest {

    @Id
    @GeneratedValue
    private long studentId;
    private String name;
    private boolean enable;
}
