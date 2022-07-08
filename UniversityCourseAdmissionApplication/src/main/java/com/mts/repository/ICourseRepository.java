package com.mts.repository;

import com.mts.entity.Course;

public interface ICourseRepository {

	void delete(Course course);

	Object findById(int courseId);

	Course save(Course course);

}
