package com.pgs.student.service;

import java.util.List;

import com.pgs.student.entity.Student;

public interface StudentService {
    public void saveStudent(Student student);
    public List<Student> findAllStudents();
    public List<Student> findAllStudentsBySchool(Integer schoolId);
}
