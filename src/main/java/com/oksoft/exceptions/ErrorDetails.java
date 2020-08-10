package com.oksoft.exceptions;

import java.util.Date;

import lombok.Data;
@Data
public class ErrorDetails {
   private Integer errorCode;
   private String errorDesc;
   private Date date;

	public ErrorDetails(Integer errorCode, String errorDesc, Date date) {
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
		this.date = date;
	}   
   
}
