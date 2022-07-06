package com.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mts.entities.AdmissionStatus;
import com.mts.entities.Applicant;
import com.mts.exception.ApplicantNotFoundException;

public interface IApplicantService {
Applicant addApplicant(Applicant a);
Applicant updateApplicant(int id,Applicant ap);
 void deleteApplicant(int id);
ResponseEntity<Applicant> viewApplicant(int id)throws ApplicantNotFoundException;
List<Applicant> viewAllApplicant();
public List<Applicant> viewApplicantsByStatus(AdmissionStatus  status);
}


