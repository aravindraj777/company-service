package com.buildlive.companyservice.service;

import com.buildlive.companyservice.entity.company.Company;

import com.buildlive.companyservice.dto.CompanyDto;

import java.util.List;
import java.util.UUID;


public interface CompanyService {
	
	Company createCompany(Company request);
	CompanyDto getCompanyByUser(UUID id);

	List<Company> getAllByUser(UUID id);

}
