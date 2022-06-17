package com.school.resgistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.resgistration.repository.entity.CourseEntity;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Long> {
    @Query("Select e from CourseEntity e where e.courseName = :courseName")
    Optional<CourseEntity> findByName(@Param("courseName") String courseName);
}
