package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.repostitory.RegisterRepository;

@Controller
public class ManagerRegisterController {
	
	@Autowired
	RegisterRepository registerRepository;
	
//	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(){
		return "employee_register";
	}
}
