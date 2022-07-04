package com.mts.entities;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admission {
	@Id
	private int admissionId;
	private int courseId;
	private int applicantId;
	private LocalDate admissionDate;
	public Admission(int admissionId, int courseId, int applicantId, LocalDate admissionDate) {
		super();
		this.admissionId = admissionId;
		this.courseId = courseId;
		this.applicantId = applicantId;
		this.admissionDate = admissionDate;
		}
	public int getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public LocalDate getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	@Override
	public String toString() {
		return "Admission [admissionId=" + admissionId + ", courseId=" + courseId + ", applicantId=" + applicantId
				+ ", admissionDate=" + admissionDate + "]";
	}
	
}