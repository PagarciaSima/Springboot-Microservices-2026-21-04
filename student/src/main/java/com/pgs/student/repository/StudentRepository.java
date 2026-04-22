package com.pgs.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgs.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
