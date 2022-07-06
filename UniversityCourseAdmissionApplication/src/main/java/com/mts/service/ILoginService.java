package com.mts.service;

import com.mts.exception.LoginFailedException;

public interface ILoginService {
	public boolean loginAsApplicant(String username,String pwd);
	public boolean loginAsAdmissionCommiteeMember(String username,String pwd);
	public boolean loginAsUniversityStaffMember(String username,String pwd)throws LoginFailedException;

}
