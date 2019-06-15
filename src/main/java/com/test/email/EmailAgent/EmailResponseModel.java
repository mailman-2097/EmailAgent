package com.test.email.EmailAgent;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class EmailResponseModel {
	
	public EmailResponseModel(String input) {
		setMessage(input);
		System.out.println("Email Response"+ input);
	}

	@JsonProperty
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	private String message;

}
