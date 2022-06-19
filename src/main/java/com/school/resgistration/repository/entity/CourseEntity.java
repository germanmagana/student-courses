package com.school.resgistration.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class CourseEntity {
    @Id
    @GeneratedValue
    private long courseId;
    private String courseName;
    private boolean enable;

}
