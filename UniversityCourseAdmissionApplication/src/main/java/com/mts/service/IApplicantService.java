package com.mts.service;

import java.util.List;

<<<<<<< HEAD
import org.springframework.http.ResponseEntity;

import com.mts.DTO.ApplicantDTO;
import com.mts.entities.AdmissionStatus;
import com.mts.entities.Applicant;
import com.mts.exception.ApplicantNotFoundException;

public interface IApplicantService {
 
	public ApplicantDTO addApplicant(ApplicantDTO applicant);
	
	public ApplicantDTO  updateApplicant(ApplicantDTO applicant)throws ApplicantNotFoundException;
	
	public  ApplicantDTO deleteApplicant(ApplicantDTO applicant)throws ApplicantNotFoundException;
	
	public ApplicantDTO viewApplicant(int applicantId)throws ApplicantNotFoundException;
	
	public List<ApplicantDTO> viewAllApplicantByStatus(AdmissionStatus status);
	
	
}


=======
import com.mts.entity.AdmissionStatus;
import com.mts.entity.Applicant;
import com.mts.exception.ApplicantNotFoundException;

public interface IApplicantService {
	public Applicant addApplicant(Applicant applicant);
	public Applicant updateApplicant(Applicant applicant) throws ApplicantNotFoundException;
	public Applicant deleteApplicant(Applicant applicant) throws ApplicantNotFoundException;
	public Applicant viewApplicant(int applicant) throws ApplicantNotFoundException;
	public List<Applicant> viewAllApplicantsByStatus(AdmissionStatus status);
}
>>>>>>> branch 'master' of https://github.com/Karan-5157/UniversityCourseAdmissionApplication.git
