package com.mts.DTO;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import com.mts.entity.Admission;
import com.mts.entity.AdmissionStatus;



@Component
public class ApplicantDTO {
	private int applicantId;
    private String applicantName;
	private String mobileNumber;
	private String applicantDegree;
	private int applicantGraduationPercent;
	private Admission admission;
	private AdmissionStatus status;
	
	public ApplicantDTO() {
		super();
	}

	public ApplicantDTO(int applicantId, String applicantName, String mobileNumber, String applicantDegree,
			int applicantGraduationPercent, Admission admission, AdmissionStatus status) {
		super();
		this.applicantId = applicantId;
		this.applicantName = applicantName;
		this.mobileNumber = mobileNumber;
		this.applicantDegree = applicantDegree;
		this.applicantGraduationPercent = applicantGraduationPercent;
		this.admission = admission;
		this.status = status;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getApplicantDegree() {
		return applicantDegree;
	}

	public void setApplicantDegree(String applicantDegree) {
		this.applicantDegree = applicantDegree;
	}

	public int getApplicantGraduationPercent() {
		return applicantGraduationPercent;
	}

	public void setApplicantGraduationPercent(int applicantGraduationPercent) {
		this.applicantGraduationPercent = applicantGraduationPercent;
	}

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

	public AdmissionStatus getStatus() {
		return status;
	}

	public void setStatus(AdmissionStatus status) {
		this.status = status;
	}

	

}
