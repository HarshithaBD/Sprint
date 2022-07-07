package com.mts.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mts.entities.Admission;
import com.mts.entities.AdmissionStatus;
import com.mts.entities.Applicant;
import com.mts.exception.ApplicantNotFoundException;

import com.mts.service.IApplicantService;

@RestController
@RequestMapping("applicant")
public class ApplicantController {
	@Autowired
	IApplicantService service;
	
	@PostMapping("/addApplicant")
	public Applicant addApplicant(@RequestBody Applicant applicant)
	{
		return service.addApplicant(applicant);
	}
	@PutMapping("/updateApplicant")
	public Applicant updateApplicant(@RequestBody Applicant applicant)throws ApplicantNotFoundException{
		return service.updateApplicant(applicant);
		
	}
	@DeleteMapping("/deleteApplicant")
	public Applicant deleteApplicant(@RequestBody Applicant applicant)throws ApplicantNotFoundException
	{
		return service.deleteApplicant(applicant);
	}
	@GetMapping("/viewApplicant/{applicantId}")
	public Applicant viewApplicant(@PathVariable int applicantId)throws ApplicantNotFoundException {
		return service.viewApplicant(applicantId);
	}
	@GetMapping("/viewAllApplicantByStatus/{status}")
	public List<Applicant> viewApplicantByStatus(@PathVariable AdmissionStatus status){
		return service.viewAllApplicantByStatus(status);
	}
}
