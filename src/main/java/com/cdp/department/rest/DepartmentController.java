package com.cdp.department.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdp.department.models.GetDepartmentDetailsRequest;
import com.cdp.department.models.GetDepartmentDetailsResponse;
import com.cdp.department.rest.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	@Autowired
	DepartmentService service;
	
	@PostMapping(value="/departmentDetails", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetDepartmentDetailsResponse> getDepartmentDetails(@RequestBody GetDepartmentDetailsRequest request) {
		GetDepartmentDetailsResponse department = service.getDepartmentDetails(request.getEmpId());
		return new ResponseEntity<GetDepartmentDetailsResponse>(department, HttpStatus.OK) ;
	}

}
