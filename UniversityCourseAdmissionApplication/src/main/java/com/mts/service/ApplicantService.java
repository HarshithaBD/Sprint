package com.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mts.entities.AdmissionStatus;
import com.mts.entities.Applicant;
import com.mts.exception.ApplicantNotFoundException;
import com.mts.repository.IApplicantRepository;

@Service
public class ApplicantService implements  IApplicantService {
	@Autowired
	IApplicantRepository repository;
	@Override
	public Applicant addApplicant(Applicant a) {
		return repository.save(a);
	}
	@Override
	public List<Applicant> viewAllApplicant()
	{
		return repository.findAll();
		}
   @Override
	public ResponseEntity<Applicant> viewApplicant(int id)throws ApplicantNotFoundException{
		Applicant a1=repository.findById(id).orElseThrow(()->new ApplicantNotFoundException("no applicant with this id"));
	return  ResponseEntity.ok().body(a1);
	}
   @Override
   public Applicant updateApplicant(int id,Applicant ap) {
	   Applicant ap1=repository.findById(id).get();
	   if(ap1!=null)
		   {
		   ap1.setApplicantId(ap.getApplicantId());
		   ap1.setApplicantName(ap.getApplicantName());
		   ap1.setMobileNumber(ap.getMobileNumber());
		   ap1.setApplicantDegree(ap.getApplicantDegree());
		   ap1.setApplicantGraduationPercent(ap.getApplicantGraduationPercent());
		   return repository.save(ap1);
		   }
	   else {
		   return ap;
	   }

   }
@Override
public void deleteApplicant(int id) {
	// TODO Auto-generated method stub
	Applicant a1=repository.findById(id).get();
	   if(a1==null)
	   {
		   System.out.println("no record find with given id");
	   }
	   else {
		   repository.delete(a1);
		   System.out.println("record deleted succefully");
	
	   }
}
@Override
public List<Applicant> viewApplicantsByStatus(AdmissionStatus status) {
	// TODO Auto-generated method stub
	return repository.findAll();
}
	

}
