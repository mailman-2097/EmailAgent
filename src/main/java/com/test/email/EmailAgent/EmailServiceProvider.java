package com.test.email.EmailAgent;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;

public interface EmailServiceProvider {
	
	public JsonNode sendSimpleMessageJson() throws UnirestException;
	
}
