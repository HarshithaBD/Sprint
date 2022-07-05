package com.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mts.entity.UniversityStaffMember;
@Repository
public interface IUniversityStaffRepository extends JpaRepository<UniversityStaffMember, Integer> {
	
}
