package com.mts.service;

import java.time.LocalDate;
import java.util.List;

<<<<<<< HEAD
import com.mts.entities.Admission;
import com.mts.exception.AdmissionNotGrantedException;

public interface IAdmissionService {

	public Admission addAdmission(Admission admission);

	 public Admission updateAdmission(Admission admission)throws AdmissionNotGrantedException;

public 	Admission removeAdmission(int admissionId)throws AdmissionNotGrantedException;

public List<Admission> showAllAdmissionByCourseId(int courseId);

public List<Admission> showAllAdmissionByDate(LocalDate admissiondate);

=======
import com.mts.entity.Admission;
import com.mts.exception.AdmissionNotGrantedException;

public interface IAdmissionService {
	public Admission addAdmission(Admission admission);
	public Admission updateAdmission(Admission admission) throws AdmissionNotGrantedException;
	public Admission cancelAdmission(int admissionId) throws AdmissionNotGrantedException;
	public List<Admission> showAllAdmissionsByCourseId(int courseId);
	public List<Admission> showAllAdmissionsByDate(LocalDate admissionDate);
	
>>>>>>> branch 'master' of https://github.com/Karan-5157/UniversityCourseAdmissionApplication.git
}
