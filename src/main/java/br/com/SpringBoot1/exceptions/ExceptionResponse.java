package br.com.SpringBoot1.exceptions;

import java.io.Serializable;

import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date timestamo;
	private String message;
	private String details;

	public ExceptionResponse(Date timestamo, String message, String details) {
		super();
		this.timestamo = timestamo;
		this.message = message;
		this.details = details;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getTimestamo() {
		return timestamo;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
