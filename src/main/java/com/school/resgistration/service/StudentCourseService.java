package com.school.resgistration.service;

import com.school.resgistration.repository.CourseRepository;
import com.school.resgistration.repository.StudentCourseRepository;
import com.school.resgistration.repository.StudentRepository;
import com.school.resgistration.repository.entity.CourseEntity;
import com.school.resgistration.repository.entity.StudentEntity;
import com.school.resgistration.service.mapper.StudentCourseMapper;
import com.school.resgistration.service.model.StudentCourseDTO;

import java.util.Optional;

/**
 * @author German Magana
 */
public class StudentCourseService {
    private final StudentCourseRepository studentCourseRepository;
    private final StudentRepository       studentRepository;
    private final CourseRepository        courseRepository;

    public StudentCourseService(StudentCourseRepository studentCourseRepository,
        StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentCourseRepository = studentCourseRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public StudentCourseDTO register(String studentName, String courseName) {

        StudentEntity studentEntity =
            Optional.ofNullable(studentRepository.findByName(studentName)).get().orElseThrow(
                () -> new StudentNotFound(
                    String.format("Student not found by name: %s", studentName)));


        CourseEntity courseEntity =
            Optional.ofNullable(courseRepository.findByName(studentName)).get().orElseThrow(
                () -> new StudentNotFound(
                    String.format("Course not found by name: %s", courseName)));

        StudentCourseDTO studentCourseDTO = new StudentCourseDTO();
        studentCourseDTO.setStudentEntity(studentEntity);
        studentCourseDTO.setCourseEntity(courseEntity);

        studentCourseRepository.save(StudentCourseMapper.INSTANCE.to(studentCourseDTO));

        return studentCourseDTO;

    }
}
