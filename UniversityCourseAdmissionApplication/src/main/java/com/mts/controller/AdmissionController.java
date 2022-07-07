package com.mts.controller;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mts.entity.Admission;
import com.mts.exception.AdmissionNotGrantedException;
import com.mts.service.IAdmissionService;

@RestController
@RequestMapping("/admission")
public class AdmissionController {
	
	@Autowired
	IAdmissionService service;
	
	@PostMapping("/addAdmission")
	public Admission addAdmission(@RequestBody Admission admission)
	{
		return service.addAdmission(admission);
		
	}
	@PutMapping("/updateAdmission")
	public Admission updateAdmission(@RequestBody Admission admission)throws AdmissionNotGrantedException{
	return service.updateAdmission(admission);
	
}
	@DeleteMapping("/removeAdmission/{admissionId}")
	public Admission removeAdmission(@PathVariable int admissionId)throws AdmissionNotGrantedException{
		return service.removeAdmission(admissionId);
	}
	@GetMapping("/showAllAdmissionByCourseId/{courseId}")
	public List<Admission>showAdmissionsByCourseId(@PathVariable int courseId)
	{
	return service.showAllAdmissionByCourseId(courseId);
}
	@GetMapping("/showAllAdmissionByDate/{admissionDate}")
	public List<Admission> showAllAdmissionsByDate(@PathVariable LocalDate admissionDate)
	{
		return service.showAllAdmissionByDate(admissionDate);
	}
}


	
