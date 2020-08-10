package com.oksoft.service;

import java.util.Map;

import com.oksoft.binding.SSAEnrollmentRequest;

public interface SSAPortalService {

	public Map<Integer,String> getAllStates();
	
	public Long ssaEnrollment(SSAEnrollmentRequest request);
	
	public SSAEnrollmentRequest checkEnrollment(Long ssn,String stateName);
	
	
}
