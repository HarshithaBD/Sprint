package com.mts.service;

import java.util.List;

import com.mts.entity.Course;
import com.mts.entity.UniversityStaffMember;
import com.mts.exception.CourseNotFoundException;

public interface IUniversityStaffService {
	//addstaff(
	public  UniversityStaffMember addStaff(UniversityStaffMember user);
	public UniversityStaffMember updateStaff(UniversityStaffMember user);
	public List<UniversityStaffMember> viewStaff();
	public void removeStaff(int staffid);
	public List<UniversityStaffMember> viewAllStaffs();
	
}
