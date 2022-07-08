
package com.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mts.entity.Course;
import com.mts.entity.UniversityStaffMember;
import com.mts.exception.CourseNotFoundException;
import com.mts.exception.UniversityStaffException;


public interface IUniversityStaffService {
	//addStaff() call 
	public  UniversityStaffMember addStaff(UniversityStaffMember user);
	
	//viewStaff() call
	public UniversityStaffMember viewStaff(int staffid) throws UniversityStaffException;
	
	//removeStaff() call
	public void removeStaff(int staffid) throws UniversityStaffException ;
	
	//viewAllStaff() call
	public List<UniversityStaffMember> viewAllStaffs();

	//updateStaff() call
	public UniversityStaffMember updateStaff(UniversityStaffMember user) throws UniversityStaffException;

	
	
	
	/*
	 * public Course addCourse(Course course);
	 * 
	 * public Course removeCourse(int courseId) throws CourseNotFoundException;
	 * 
	 * public Course updateCourse(Course course) throws CourseNotFoundException;
	 */


	
}
