package com.school.resgistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.resgistration.repository.entity.CourseEntity;
@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Long> {
}
