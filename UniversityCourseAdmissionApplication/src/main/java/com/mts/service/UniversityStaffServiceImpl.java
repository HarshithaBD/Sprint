package com.mts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mts.entity.Course;
import com.mts.entity.UniversityStaffMember;
import com.mts.exception.CourseNotFoundException;
import com.mts.repository.IUniversityStaffRepository;

@Service
public class UniversityStaffServiceImpl implements IUniversityStaffService {
	
	@Autowired
	private IUniversityStaffRepository staffRepository;


	@Override
	public UniversityStaffMember addStaff(UniversityStaffMember user) {
	return	staffRepository.save(user);
	}


	@Override
	public UniversityStaffMember updateStaff(UniversityStaffMember user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UniversityStaffMember> viewStaff() {    
		return  staffRepository.findAll();
	}


	@Override
	public void removeStaff(int staffid) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<UniversityStaffMember> viewAllStaffs() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Course removeCourse(int courseId) throws CourseNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Course updateCourse(Course course) throws CourseNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
	 
	
	  
	 
}
