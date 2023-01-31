package com.cdp.department.rest.service.impl;

import org.springframework.stereotype.Service;

import com.cdp.department.models.GetDepartmentDetailsResponse;
import com.cdp.department.rest.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public GetDepartmentDetailsResponse getDepartmentDetails(int empId) {
		
		switch(empId) {
		case 1:
			return new GetDepartmentDetailsResponse(1, "Technical");
		case 2:
			return new GetDepartmentDetailsResponse(2, "HR");
		case 3:
			return new GetDepartmentDetailsResponse(3, "Managerial");
		case 4:
			return new GetDepartmentDetailsResponse(4, "IT");
		default:
			return new GetDepartmentDetailsResponse(0, "NA");
		}
		
	}

}
