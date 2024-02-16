package com.example.Gmailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class GmailerApplication {
	@Autowired
	private  EmailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(GmailerApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail()  {
		senderService.sendEmail("afifimajd383@gmail.com",

				"This is email body",
				"This is Email Subject"
		);
	}

}
