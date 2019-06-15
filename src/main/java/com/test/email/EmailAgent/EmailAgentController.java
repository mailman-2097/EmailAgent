package com.test.email.EmailAgent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashape.unirest.http.exceptions.UnirestException;


@RestController
public class EmailAgentController {

	@Autowired
	private MailGunEmailServiceProvider mg_provider;

	@Autowired
	private MailJetEmailServiceProvider sg_provider;
	
	 @RequestMapping(value="/sendmail1")
	 public EmailResponseModel sendEmail1()  {
		 	EmailResponseModel response = null;
		 	try {
		 		response = new EmailResponseModel(mg_provider.sendSimpleMessageJson().toString());
			} catch (UnirestException e) {
				
				e.printStackTrace();
			}
	        return response;
	    
	}
	 @RequestMapping(value="/sendmail2")
	 public EmailResponseModel sendEmail2()  {
		 	EmailResponseModel response = null;
		 	try {
		 		response = new EmailResponseModel(sg_provider.sendSimpleMessageJson().toString());
			} catch (UnirestException e) {
				
				e.printStackTrace();
			}
	        return response;
	    
	}

}
