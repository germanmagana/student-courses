package com.school.resgistration.controller;


import com.school.resgistration.controller.model.StudentCourseRequest;
import com.school.resgistration.controller.model.StudentCourseResponse;
import com.school.resgistration.controller.model.StudentRequest;
import com.school.resgistration.service.StudentCourseService;
import com.school.resgistration.service.model.StudentCourseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-student-course/")
public class StudentCourseController {

    private final StudentCourseService studentCourseService;

    public StudentCourseController(StudentCourseService studentCourseService) {
        this.studentCourseService = studentCourseService;
    }


    @PostMapping(value = "student-course", consumes = "application/json", produces = "application"
        + "/json")
    @Operation(summary = "register student to course")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "register student to course",
                     content = { @Content(mediaType = "application/json",
                                          schema = @Schema(implementation = StudentCourseRequest.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid registration",
                     content = @Content)})
    public StudentCourseResponse register(@RequestBody StudentCourseRequest studentCourseRequest){
        StudentCourseDTO studentCourseDTO = studentCourseService
            .register(studentCourseRequest.getStudentName(), studentCourseRequest.getCourseName());

        return  StudentCourseResponse.builder()
            .courseEntity(studentCourseDTO.getCourseEntity())
            .courseEntity(studentCourseDTO.getCourseEntity())
            .build();
    }
}
