package com.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
=======
import com.mts.entity.Applicant;
>>>>>>> branch 'master' of https://github.com/Karan-5157/UniversityCourseAdmissionApplication.git

<<<<<<< HEAD
import com.mts.entities.AdmissionStatus;
import com.mts.entities.Applicant;
=======
@Repository
public interface IApplicantRepository extends JpaRepository<Applicant, Integer> {
>>>>>>> branch 'master' of https://github.com/Karan-5157/UniversityCourseAdmissionApplication.git

@Repository
public interface IApplicantRepository extends JpaRepository<Applicant,Integer>{
	 List<Applicant>findByStatus(AdmissionStatus status);
}
