package com.oksoft.binding;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SSAEnrollmentRequest {

	
	private String firstName;
	private String lastName;
	private String gender;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date dateOfBirth;
	private String stateName;
	
}
