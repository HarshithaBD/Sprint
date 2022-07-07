package com.mts.service;

import java.util.List;

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


