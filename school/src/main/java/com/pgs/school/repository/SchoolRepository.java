package com.pgs.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgs.school.entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
