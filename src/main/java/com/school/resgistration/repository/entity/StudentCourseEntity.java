package com.school.resgistration.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class StudentCourseEntity {
    @Id
    @GeneratedValue
    private long studentCourseId;
    @OneToOne
    private StudentEntity studentEntity;
    @OneToOne
    private CourseEntity courseEntity;

}
