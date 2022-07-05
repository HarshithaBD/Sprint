package com.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mts.entity.UniversityStaffMember;
import com.mts.service.UniversityStaffServiceImpl;

@RestController
@RequestMapping("/university")
public class UniversityStaffMemberController {
       
	   @Autowired
	   private UniversityStaffServiceImpl staffServiceImpl;

	public UniversityStaffMemberController(UniversityStaffServiceImpl staffServiceImpl) {
		super();
		this.staffServiceImpl = staffServiceImpl;
	}
	
	@PostMapping("/addstaff")
	public UniversityStaffMember addStaff(@RequestBody UniversityStaffMember user) {
		return staffServiceImpl.addStaff(user);
	}
	
	@GetMapping(path="viewstaff")
	public List<UniversityStaffMember> viewStaff() {
		return staffServiceImpl.viewStaff();
	}
}
