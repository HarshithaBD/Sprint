
package com.mts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mts.entity.AdmissionStatus;
import com.mts.entity.Applicant;
@Repository
public interface IApplicantRepository extends JpaRepository<Applicant,Integer>{
	 List<Applicant>findByStatus(AdmissionStatus status);
}

