package com.test.email.EmailAgent;

import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;



@Service
public class MailGunEmailServiceProvider implements EmailServiceProvider {
	
	private static final String API_KEY = "86111ddb84df711a0341ec02ef96058a-16ffd509-a76a67cc" ;
	private static final String DOMAIN = "sandbox36b478c26c6644dc8d27f5679f3a0640.mailgun.org" ;
	private static final String URL = "https://api.mailgun.net/v3/" + DOMAIN + "/messages";

	public JsonNode sendSimpleMessageJson() throws UnirestException {
			HttpResponse<JsonNode> request = Unirest.post(URL)
				.basicAuth("api", API_KEY)
                .field("from", "Nishad Saithaly <fromtestemail@gmx.com>")
                .field("to", "totestemail@gmx.com")
                .field("subject", "Test Email")
                .field("text", "Test Email from GMX Id")
				.asJson();
			return request.getBody();

	}

}
