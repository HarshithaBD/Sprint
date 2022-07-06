package com.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mts.entities.Applicant;

@Repository
public interface IApplicantRepository extends JpaRepository<Applicant,Integer>{
	
}
