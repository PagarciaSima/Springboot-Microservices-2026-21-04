package com.pgs.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pgs.student.entity.Student;
import com.pgs.student.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

	private final StudentRepository repository;

	@Override
	public void saveStudent(Student student) {
		repository.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		return repository.findAll();
	}

	@Override
	public List<Student> findAllStudentsBySchool(Integer schoolId) {
		return repository.findAllBySchoolId(schoolId);
	}
}
