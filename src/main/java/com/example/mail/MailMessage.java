package com.example.mail;

import javax.persistence.criteria.Order;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailMessage implements OrderMessage {

	MailSender mailsender;
	SimpleMailMessage simplemailMessage;

	public void setMailSender(MailSender mailsender) {
		this.mailsender = mailsender;
	}

	public void setTemplateMessage(SimpleMailMessage simplemailMessage) {
		this.simplemailMessage = simplemailMessage;
	}

	@Override
	public void placeOrder(String sendto,String subject,String mainMessage) {
		// TODO Auto-generated method stub

		SimpleMailMessage message = new SimpleMailMessage(
				this.simplemailMessage);
		message.setTo(sendto);
		message.setText(mainMessage);
		message.setSubject(subject);
		try {
			this.mailsender.send(message);
		} catch (MailException ex) {
			ex.printStackTrace();
			System.out.println("出错了‘’‘’‘’‘’‘");

		}
	}
}
