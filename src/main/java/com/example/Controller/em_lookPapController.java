package com.example.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.ExtraSalary;
import com.example.repostitory.SalaryRepository;

@Controller
public class em_lookPapController {
	@Autowired
	SalaryRepository salaryRepository;
	@RequestMapping("lookuppap")
	@ResponseBody
	List priapub(@RequestParam("lookuppaps")String month,HttpSession session){
		List<ExtraSalary> salary = salaryRepository.findByUseridAndMonth((Long)session.getAttribute("username"),month); 
		if(salary.size()!=0){
			return salary;
		}else{
			return null;
		}
	}
}
