package com.school.resgistration.service;

import java.util.function.Supplier;

public class StudentNotFound extends RuntimeException {

    public StudentNotFound(String message) {
        super(message);
    }
}
