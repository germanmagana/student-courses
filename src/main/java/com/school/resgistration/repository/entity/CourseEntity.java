package com.school.resgistration.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CourseEntity {
    @Id
    private long courseId;
    private String courseName;
    private boolean enable;
    private String description;

}
