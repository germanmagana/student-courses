package com.school.resgistration.service;

import com.school.resgistration.repository.StudentRepository;
import com.school.resgistration.repository.entity.StudentEntity;
import com.school.resgistration.service.mapper.StudentMapper;
import com.school.resgistration.service.model.StudentDTO;

import java.util.List;

/**
 * @author German Magana
 *
 */
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * This method save a student
     * @param studentDTO
     * @return
     */
    public StudentDTO save(StudentDTO studentDTO){
        StudentEntity studentEntity = studentRepository.save(StudentMapper.INSTANCE.to(studentDTO));
        return StudentMapper.INSTANCE.from(studentEntity);
    }

    /**
     * This method fetches all the students
     * @return
     */
    public List<StudentDTO> findAll(){
        return StudentMapper.INSTANCE.fromList(studentRepository.findAll());
    }

    /**
     * This method deletes a student
     * @param studentDTO
     */
    public void delete(StudentDTO studentDTO){
      studentRepository.delete(StudentMapper.INSTANCE.to(studentDTO));
    }

}
