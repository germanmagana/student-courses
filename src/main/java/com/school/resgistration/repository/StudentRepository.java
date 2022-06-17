package com.school.resgistration.repository;

import com.school.resgistration.repository.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long > {
    @Query("Select e from StudentEntity e where e.name = :studentName")
    Optional<StudentEntity> findByName(@Param("studentName") String studentName);
}
