package com.example.Controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Employee;
import com.example.domain.EmployeeRegister;
import com.example.repostitory.Em_RegisterRespository;
import com.example.repostitory.EmployeeRepository;

@Controller
public class Em_RegisterController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	Em_RegisterRespository registerRespository;
	
	@RequestMapping("/em_registerput")
	String em_registerput(@RequestParam("username")Long username,@RequestParam("password")String password,Model model){
		Employee employee = employeeRepository.findOne(username);
		if(employee!=null&&password!=""){
			EmployeeRegister employeeRegister = new EmployeeRegister(username, password);
			registerRespository.save(employeeRegister);
			return "register_success";
		}else if(employee==null){
			model.addAttribute("errormessage", "未找到该用户编号");
			return "em_register";
		}else if(password==""||username.toString()==""){
			model.addAttribute("errormessage", "将信息填写完整");
			return "em_register";
		}
		return null;
	}
	
	@RequestMapping("em_logre")
	String logre(){
		return "em_logre";
	}
	
	@RequestMapping("em_register")
	String em_register(){
		return "em_register";
	}
	
	
	@RequestMapping("employee_login")
	String employee_login(@RequestParam("username")Long username,@RequestParam("password")String password,Model model,HttpSession session){
		EmployeeRegister employee=registerRespository.findByUserid(username);
		System.out.println(employee+"employee");
		if(employee.getPassword().equals(password)){
			session.setAttribute("username", username);
			return "em_loginsuccess";
		}
		
		else{
			model.addAttribute("errormessage", "用户编号或密码错误");
			return "em_logre";
		}
		
	}
	
}
