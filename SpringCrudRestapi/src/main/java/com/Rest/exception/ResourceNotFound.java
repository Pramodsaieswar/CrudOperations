package com.Rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND )
public class ResourceNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldname;
	private Object fieldvalue;// bec the field value can be any type/

	public ResourceNotFound(String resourceName, String fieldname, Object fieldvalue) {
		super(String.format("%s not found with %s: '%s'", fieldname, resourceName, fieldvalue));
		this.resourceName = resourceName;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldname() {
		return fieldname;
	}

	public Object getFieldvalue() {
		return fieldvalue;
	}

}
