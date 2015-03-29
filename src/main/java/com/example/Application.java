package com.example;

import javax.persistence.criteria.Order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.filter.CharacterEncodingFilter;


import com.example.mail.MailMessage;
import com.example.mail.OrderMessage;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
	
	@Bean
	JavaMailSender javaMailSender(){
		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
		javaMailSenderImpl.setHost("smtp.qq.com");
		javaMailSenderImpl.setUsername("2650454635@qq.com");
		javaMailSenderImpl.setPassword("wxcy199404");

		return javaMailSenderImpl;
	}
	@Bean
	SimpleMailMessage simpleMailMessage(){
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("2650454635@qq.com");
		message.setSubject("HumanResource");
		return message;
		
	}
	
	@Bean
	OrderMessage orderMessage(MailSender mailsender,SimpleMailMessage mailMessage ){
		MailMessage message = new MailMessage();
		message.setMailSender(mailsender);
		message.setTemplateMessage(mailMessage);
		return message;
	
	}

	@Bean
	CharacterEncodingFilter characterEncodingFilter() {
//		FilterRegistrationBean bean = new FilterRegistrationBean();
		
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("utf-8");
		
//		bean.setFilter(filter);
		
		return filter;

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
