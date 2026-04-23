package com.pgs.school.service;

import java.util.List;

import com.pgs.school.entity.School;
import com.pgs.school.response.FullSchoolResponse;

public interface SchoolService {

	void saveSchool(School school);

	List<School> findAllSchools();

	FullSchoolResponse findSchoolsWithStudents(Integer schoolId);

}
