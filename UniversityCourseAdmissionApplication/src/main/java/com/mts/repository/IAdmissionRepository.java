package com.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
=======
import com.mts.entity.Admission;
>>>>>>> branch 'master' of https://github.com/Karan-5157/UniversityCourseAdmissionApplication.git

<<<<<<< HEAD
import com.mts.entities.Admission;

public interface IAdmissionRepository extends JpaRepository<Admission,Integer> {
	
	List<Admission> findByCourseId(int courseId);
	List<Admission> findByadmissionDate(LocalDate admissionDate);

}
=======
@Repository
public interface IAdmissionRepository extends JpaRepository<Admission, Integer> {

}
>>>>>>> branch 'master' of https://github.com/Karan-5157/UniversityCourseAdmissionApplication.git
