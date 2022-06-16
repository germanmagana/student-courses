package com.school.resgistration.controller;

import com.school.resgistration.controller.mapper.CourseRequestMapper;
import com.school.resgistration.controller.mapper.CourseResponseMapper;
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
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author German Magana
 *
 */
@RestController
@RequestMapping("/api-course/")
@SecurityRequirement(name = "Student-Course")
@Tag(description = "Course resources that provides access to student data",
     name = "Course Resource")
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

    @DeleteMapping(value = "course",consumes = "application/json", produces = "application/json")
    @Operation(summary = "delete course")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "delete course",
                     content = { @Content(mediaType = "application/json",
                                          schema = @Schema(implementation = CourseRequest.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid course",
                     content = @Content)})
    public CourseResponse delete(@RequestBody CourseRequest courseRequest){
        courseService.delete(CourseRequestMapper.INSTANCE.to(courseRequest));
        return CourseRequestMapper.INSTANCE.from(CourseRequestMapper.INSTANCE.to(courseRequest));
    }

    @GetMapping(value = "course", produces = "application/json")
    @Operation(summary = "get courses")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "get course",
                     content = { @Content(mediaType = "application/json",
                                          schema =
                                          @Schema(implementation = List.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid course",
                     content = @Content)})
    public List<CourseResponse> fetchCourses(){
        return CourseResponseMapper.INSTANCE.fromList(courseService.findAll());
    }
}
