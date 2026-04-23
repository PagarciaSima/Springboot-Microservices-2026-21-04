package com.pgs.school.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pgs.school.client.StudentClient;
import com.pgs.school.entity.School;
import com.pgs.school.repository.SchoolRepository;
import com.pgs.school.response.FullSchoolResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository repository;
    private final StudentClient client;

    @Override
    public void saveSchool(School school) {
        repository.save(school);
    }

    @Override
    public List<School> findAllSchools() {
        return repository.findAll();
    }

    @Override
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = repository.findById(schoolId)
	        .orElse(
                School.builder()
                    .name("NOT_FOUND")
                    .email("NOT_FOUND")
                    .build()
	        );
        var students = client.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
