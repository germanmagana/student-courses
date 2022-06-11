package com.school.resgistration.controller;

import com.school.resgistration.controller.mapper.CourseRequestMapper;
import com.school.resgistration.controller.model.CourseRequest;
import com.school.resgistration.controller.model.CourseResponse;
import com.school.resgistration.service.CourseService;
import com.school.resgistration.service.model.CourseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SecurityRequirement(name = "Student-Course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping(value = "course",consumes = "application/json", produces = "application/json")
    @Operation(summary = "save course")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "save course",
                     content = { @Content(mediaType = "application/json",
                                          schema = @Schema(implementation = CourseRequest.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid course",
                     content = @Content)})
    public CourseResponse save(@RequestBody CourseRequest courseRequest){
        CourseDTO courseDTO = courseService.save(CourseRequestMapper.INSTANCE.to(courseRequest));
        return CourseRequestMapper.INSTANCE.from(courseDTO);

    }
}
