package com.mts.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.mts.DTO.ApplicantDTO;
import com.mts.entity.Applicant;

public class Converter {
	public static ApplicantDTO convertApplicantToDTO(Applicant applicant) 
	{
		ApplicantDTO applicantdto=new ApplicantDTO();
		BeanUtils.copyProperties(applicant, applicantdto);
		return applicantdto;
	}

	public static List<ApplicantDTO> convertApplicantToDTO(List<Applicant> listDto)
	{
		List<ApplicantDTO> list =new ArrayList<>();
		for(Applicant applicant:listDto)
		{
			list.add(convertApplicantToDTO(applicant));
		}
		return list;
	}

	public static Applicant convertApplicantToEntity(Applicant applicantDto) 
	{
		Applicant applicant1=new Applicant();
		BeanUtils.copyProperties(applicant1, applicant1);
		return applicant1;
	}

	public static List<Applicant> convertApplicantDtoToEntity(List<Applicant> listDto)
	{
		List<Applicant> list =new ArrayList<>();
		for(Applicant applicant:listDto)
		{
			list.add(convertApplicantToEntity(applicant));
		}
		return list;
	}
}
