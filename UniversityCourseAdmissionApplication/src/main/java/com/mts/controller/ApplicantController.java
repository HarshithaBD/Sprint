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
import com.mts.service.ApplicantService;

@RestController
public class ApplicantController {
	@Autowired
	ApplicantService service;
	
	@PostMapping(value="/applicant/add")
	public Applicant addApplicant(@RequestBody Applicant a)

	{
		return service.addApplicant(a);
	}
	@GetMapping("/applicant/all")
	public List<Applicant> viewAllApplicant(){

		return service.viewAllApplicant();
		}
	@GetMapping("/applicant/id/{id}")
	public ResponseEntity<Applicant>  viewApplicant(@PathVariable int id)throws ApplicantNotFoundException 
	{
		return service.viewApplicant(id);
	}
	@GetMapping("/applicant/status/{status}")
	public List<Applicant> viewAllApplicantByStatus(@PathVariable("status")AdmissionStatus status) 
	{
		return service.viewApplicantsByStatus(status);
	}
	@PutMapping("/applicant/update/{id}")
	public Applicant updateApplicant(@PathVariable int id,@RequestBody Applicant ap) 
	{
		return service.updateApplicant(id,ap);
	}
	@DeleteMapping("/applicant/delete/{id}")
	public void deleteApplicant(@PathVariable int id)
	{
		service.deleteApplicant(id);

	}
}
