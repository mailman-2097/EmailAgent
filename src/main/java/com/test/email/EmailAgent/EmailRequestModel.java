package com.test.email.EmailAgent;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class EmailRequestModel {
	
	public EmailRequestModel(
			String sender, 
			String receiver, 
			String emailSubject,
			String emailBody) {
		setSender(sender);
		setReceiver(receiver);
		setEmailSubject(emailSubject);
		setEmailBody(emailBody);
	}
	
	private String sender;
	private String receiver;
	private String emailSubject;
	private String emailBody;
	
	public String getSender() {
		return sender;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	@JsonProperty
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	@JsonProperty
	public String getEmailSubject() {
		return emailSubject;
	}
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
	
	@JsonProperty
	public String getEmailBody() {
		return emailBody;
	}
	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}


}
