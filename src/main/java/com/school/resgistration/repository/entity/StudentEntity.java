package com.school.resgistration.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class StudentEntity {

    @Id
    private long studentId;
    private String name;
    private boolean enable;
}
