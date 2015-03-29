package com.example.Controller;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Employee;
import com.example.form.EmployeeForm;
import com.example.repostitory.EmployeeRepository;

@Controller
public class SearchController {

	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping("searchname")
	@ResponseBody
	public List<Employee> searchname(@RequestParam("keyname") String key) {
		List<Employee> list = employeeRepository.findByNameContaining(key);
		return list;
	}

	@RequestMapping("searchid")
	@ResponseBody
	public Employee searchid(@RequestParam("keyid") Long key) {
		Employee employee = employeeRepository.findOne(key);
		return employee;
	}

	@RequestMapping("lookupinfo")
	public String LookupInfo() {
		return "lookupinfo";
	}

	@RequestMapping("lookupskill")
	public String LookupSkill() {
		return "lookupskill";
	}

	@RequestMapping("changename")
	String changeName(@RequestParam("id") Long id, Model model,
			HttpSession session) {
		Employee employee = employeeRepository.findOne(id);
		session.setAttribute("id", id);
		model.addAttribute("employee", employee);
		return "changeinfo";
	}

	@RequestMapping("deletename")
	String deletename(@RequestParam("id") Long id) {
		employeeRepository.delete(id);
		return "register_success";
	}

	@RequestMapping("changeinfom")
	String changeinfo(@Valid EmployeeForm employee, HttpSession session) {
		Long id = (Long) session.getAttribute("id");
		Employee emp = employeeRepository.findOne(id);
		employee.setId(id);
		employee.setEnterTime(emp.getEnterTime());
		BeanUtils.copyProperties(employee, emp);
		employeeRepository.save(emp);
		return "register_success";
	}
	
	@RequestMapping("lookupinfoall")
	String list(Model model){
		List<Employee>list =employeeRepository.findAll();
		model.addAttribute("infoallpage", (list.size()+1)/2);
		model.addAttribute("lookupallinfocontent", list);
		return "lookallinfo";
	}
	
	@RequestMapping("lookupinfopage")
	String lookupinfopage(Pageable page,Model model){
		Page<Employee> list=employeeRepository.findAll(page);
		model.addAttribute("lookupallinfocontent", list.getContent());
		model.addAttribute("infoallpage", list.getTotalPages());
		return "lookallinfo";
		
		
	}
}
