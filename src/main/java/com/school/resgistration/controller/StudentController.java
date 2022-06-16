package com.school.resgistration.controller;

import com.school.resgistration.controller.mapper.StudentRequestMapper;
import com.school.resgistration.controller.model.CourseRequest;
import com.school.resgistration.controller.model.StudentRequest;
import com.school.resgistration.controller.model.StudentResponse;
import com.school.resgistration.service.StudentService;
import com.school.resgistration.service.model.StudentDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author German Magana
 *
 */
@RestController
@RequestMapping("/api-student/")
@SecurityRequirement(name = "Student-Course")
@Tag(description = "Student resources that provides access to student data",
     name = "Student Resource")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "student", consumes = "application/json", produces = "application/json")
    @Operation(summary = "save course")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "save course",
                     content = { @Content(mediaType = "application/json",
                                          schema = @Schema(implementation = StudentRequest.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid course",
                     content = @Content)})
    public StudentResponse save(@RequestBody StudentRequest studentRequest){
        StudentDTO studentDTO = studentService.save(StudentRequestMapper.INSTANCE.to(studentRequest));
        return StudentRequestMapper.INSTANCE.from(studentDTO);
    }

    @DeleteMapping(value = "student", consumes = "application/json", produces = "application/json")
    @Operation(summary = "delete course")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "delete course",
                     content = { @Content(mediaType = "application/json",
                                          schema = @Schema(implementation = CourseRequest.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid course",
                     content = @Content)})
    public StudentResponse delete(@RequestBody StudentRequest studentRequest){
         studentService.delete(StudentRequestMapper.INSTANCE.to(studentRequest));
        return StudentRequestMapper.INSTANCE.from(StudentRequestMapper.INSTANCE.to(studentRequest));
    }

    @GetMapping(value = "students", produces = "application/json")
    @Operation(summary = "get courses")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "get course",
                     content = { @Content(mediaType = "application/json",
                                          schema =
                                          @Schema(implementation = List.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid course",
                     content = @Content)})
    public List<StudentResponse> fetchCourses(){
        return StudentRequestMapper.INSTANCE.fromList(studentService.findAll());
    }
}
