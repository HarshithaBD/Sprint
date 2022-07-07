package com.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mts.entities.AdmissionStatus;
import com.mts.entities.Applicant;
import com.mts.exception.ApplicantNotFoundException;

public interface IApplicantService {
 
	public Applicant addApplicant(Applicant applicant);
	
	public Applicant  updateApplicant(Applicant applicant)throws ApplicantNotFoundException;
	
	public  Applicant deleteApplicant(Applicant applicant)throws ApplicantNotFoundException;
	
	public Applicant viewApplicant(int applicantId)throws ApplicantNotFoundException;
	
	public List<Applicant> viewAllApplicantByStatus(AdmissionStatus status);
	
	
}


