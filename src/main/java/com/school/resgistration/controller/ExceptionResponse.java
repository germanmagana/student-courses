package com.school.resgistration.controller;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class ExceptionResponse {

    private String         message;
    private OffsetDateTime dateTime;

}
