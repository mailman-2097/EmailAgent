package com.test.email.EmailAgent;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import com.mashape.unirest.http.exceptions.UnirestException;

@Service
public class MailJetEmailServiceProvider {

	
	private static final String MJ_APIKEY_PUBLIC = "bff0d248e1d6bd239450ee1ca70ad097" ;
	private static final String MJ_APIKEY_PRIVATE = "c1eb26668b3bd46fd099d7adb8581550" ;

	public JSONArray sendSimpleMessageJson() throws UnirestException {

		MailjetClient client = null;
		MailjetRequest email = null;
		MailjetResponse response = null;
		JSONArray jsonResponse = null;

		// Note how we set the version to v3.1 using ClientOptions
		client = new MailjetClient(MJ_APIKEY_PUBLIC, MJ_APIKEY_PRIVATE, new ClientOptions("v3.1"));

		// client = new MailjetClient(MJ_APIKEY_PUBLIC, MJ_APIKEY_PRIVATE, new ClientOptions("v3","https://api.us.mailjet.com"));

		
		JSONObject message = new JSONObject();
		message.put(Emailv31.Message.FROM, new JSONObject()
		  .put(Emailv31.Message.EMAIL, "fromtestemail@gmx.com")
		  .put(Emailv31.Message.NAME, "Mailjet Pilot")
		)
		.put(Emailv31.Message.SUBJECT, "Your email flight plan!")
		.put(Emailv31.Message.TEXTPART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
		.put(Emailv31.Message.TO, new JSONArray()
		.put(new JSONObject()
		.put(Emailv31.Message.EMAIL, "totestemail@gmx.com")));

		email = new MailjetRequest(Emailv31.resource).property(Emailv31.MESSAGES, (new JSONArray()).put(message));

		try {
			response = client.post(email);
			jsonResponse = response.getData();
		} catch (MailjetException | MailjetSocketTimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonResponse;

	}	
}
