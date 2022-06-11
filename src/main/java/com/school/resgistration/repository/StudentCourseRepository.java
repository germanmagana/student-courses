package com.school.resgistration.repository;

import com.school.resgistration.repository.entity.StudentCourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourseEntity,Long > {
}
