package com.mts.service;

import org.springframework.http.ResponseEntity;

import com.mts.entities.Admission;
import com.mts.exception.AdmissionNotFoundException;

public interface IAdmissionService {
	Admission addAdmission(Admission e);
	Admission updateAdmission(int id,Admission  e);
	ResponseEntity<Admission> showAdmission(int id)throws AdmissionNotFoundException;
	
}
