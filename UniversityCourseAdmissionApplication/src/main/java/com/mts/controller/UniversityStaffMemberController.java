package com.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mts.entity.Course;
import com.mts.entity.UniversityStaffMember;
import com.mts.exception.CourseNotFoundException;
import com.mts.exception.UniversityStaffException;
import com.mts.service.IUniversityStaffService;
import com.mts.service.UniversityStaffServiceImpl;

@RestController
@RequestMapping("/university")
public class UniversityStaffMemberController {
       
	   @Autowired
	   IUniversityStaffService staffService;
	   
    //addstaff
	@PostMapping("/addstaff")
	public UniversityStaffMember addStaff(@RequestBody UniversityStaffMember user) {
		return staffService.addStaff(user);
	}
	//updatestaff
	@PutMapping("/updatestaff")
	public UniversityStaffMember updateStaff(@RequestBody UniversityStaffMember user) throws UniversityStaffException{
		return staffService.updateStaff(user);
	}
	//viewstaff
	@GetMapping("viewstaff/{staffid}")
	public UniversityStaffMember viewStaff(@PathVariable int staffid) throws UniversityStaffException{
		return staffService.viewStaff(staffid);
	}
		
	//removestaff
		@DeleteMapping("/removestaff/{staffid}") 
		public void removeStaff(@PathVariable int staffid) throws UniversityStaffException{
			staffService.removeStaff(staffid);
	}
			
	//viewall staff
		@GetMapping("/viewall")
				public List<UniversityStaffMember> viewAllStaffs(){
				return staffService.viewAllStaffs();
		}
			
		/*
		 * @PostMapping("/addCourse") public Course addCourse(@RequestBody Course
		 * course){ return staffService.addCourse(course); }
		 */
		/*
		 * @DeleteMapping("/removeCourse/{courseId}") public Course
		 * removeCourse(@PathVariable int courseId) throws CourseNotFoundException{
		 * return staffService.removeCourse(courseId); }
		 */
	 
		/*
		 * @PutMapping("/updateCourse") public Course updateCourse(@RequestBody Course
		 * course) throws CourseNotFoundException { return
		 * staffService.updateCourse(course); }
		 */
}
		
	

