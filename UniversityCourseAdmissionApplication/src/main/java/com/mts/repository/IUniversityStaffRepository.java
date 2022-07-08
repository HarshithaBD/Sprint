
package com.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mts.entity.UniversityStaffMember;

public interface IUniversityStaffRepository extends JpaRepository<UniversityStaffMember, Integer>{
}

