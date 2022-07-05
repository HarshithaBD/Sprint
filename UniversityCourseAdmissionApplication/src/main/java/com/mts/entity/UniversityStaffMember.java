package com.mts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="university_staff_member")
public class UniversityStaffMember {
	
	@Id
	private int staffId;
	
	@Pattern(regexp="[6-9]{1}[0-9]{9}",messaage="password must have 10 characters")
	private String password;
	
	@NotBlank(message="role should not be blank")
	private String role;
	
	public UniversityStaffMember() {
		super();
	}
	public UniversityStaffMember(int staffId, String password, String role) {
		super();
		this.staffId = staffId;
		this.password = password;
		this.role = role;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "UniversityStaffMember [staffId=" + staffId + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
