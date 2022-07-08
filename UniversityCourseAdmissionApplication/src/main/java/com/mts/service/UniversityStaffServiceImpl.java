package com.mts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mts.entity.Course;
import com.mts.entity.UniversityStaffMember;
import com.mts.exception.CourseNotFoundException;
import com.mts.exception.UniversityStaffException;
import com.mts.repository.ICourseRepository;
import com.mts.repository.IUniversityStaffRepository;

@Service
public class UniversityStaffServiceImpl implements IUniversityStaffService {
	
	@Autowired
    IUniversityStaffRepository staffRepository;

	/*
	 * @Autowired ICourseRepository courseRepository;
	 */

	@Override
	public UniversityStaffMember addStaff(UniversityStaffMember user) {
	return	staffRepository.save(user);
	}


	@Override
	public UniversityStaffMember updateStaff(UniversityStaffMember user) throws UniversityStaffException {
		UniversityStaffMember member=staffRepository.findById(user.getStaffId()).orElseThrow(()-> new UniversityStaffException ("cannot update as Id not found"));
			member.setPassword(user.getPassword());
			member.setRole(user.getRole());
			return member;
		}

	@Override
	public UniversityStaffMember viewStaff(int staffid) throws UniversityStaffException {
		return staffRepository.findById(staffid).orElseThrow(()-> new UniversityStaffException ("there is no staff with this id"));
	}


	@Override
	public void removeStaff(int staffid) throws UniversityStaffException {
		 staffRepository.deleteById(staffid);
	}

	@Override
	public List<UniversityStaffMember> viewAllStaffs() {
		return staffRepository.findAll();
	}

	/*
	 * @Override public Course addCourse(Course course) { return
	 * courseRepository.save(course); }
	 */

	/*
	 * @Override public Course removeCourse(int courseId) throws
	 * CourseNotFoundException { Course
	 * course=courseRepository.findById(courseId).orElseThrow(()-> new
	 * CourseNotFoundException("No record present with given id"));
	 * courseRepository.delete(course); return course; }
	 */

	/*
	 * @Override public Course updateCourse(Course course) throws
	 * CourseNotFoundException { Course
	 * existingCourse=courseRepository.findById(course.getCourseId()).orElseThrow(()
	 * -> new CorseNotFoundException("cannot update"));
	 * existingCourse.setCourseName(course.getCourseName());
	 * existingCourse.setCourseDuration(course.getCourseDuration());
	 * existingCourse.setCourseStartDate(course.getCourseStartDate());
	 * existingCourse.setCourseEndDate(course.getCourseEndDate());
	 * existingCourse.setCourseFees(course.getCourseFees()); return
	 * courseRepository.save(existingCourse); }
	 */
}
