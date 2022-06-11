package com.school.resgistration.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class StudentCourseEntity {
    @Id
    private long studentCourseId;
    @OneToOne
    private StudentEntity studentEntity;
    @OneToOne
    private CourseEntity courseEntity;

}
