package com.example.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.BaseSalary;
import com.example.domain.Employee;
import com.example.domain.EmployeeSalary;
import com.example.domain.ExtraSalary;
import com.example.repostitory.BasesalaryRepository;
import com.example.repostitory.EmployeeRepository;
import com.example.repostitory.SalaryRepository;

@Controller
public class SalaryController {

	@Autowired
	SalaryRepository salaryRepository;
	@Autowired
	BasesalaryRepository basesalaryRepository;
	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping("extrasalary")
	String salary() {
		return "extrasalary";
	}

	@RequestMapping("basesalary")
	String basesalary() {
		return "basesalary";
	}

	@RequestMapping("loup_pap")
	String lookups() {
		return "loup_pap";
	}

	@RequestMapping("salary")
	String salary(@RequestParam("userid") Long id,
			@RequestParam("username") String username,
			@RequestParam("cause") String cause,
			@RequestParam("money") Double money,
			@RequestParam("month") String month) {
		if (id.toString() != "" && username != "" && cause != ""
				&& money.toString() != "") {
			ExtraSalary extrasalary = new ExtraSalary(id, username, cause,
					money, new Date(), month);
			salaryRepository.save(extrasalary);
			return "register_success";
		}
		return null;
	}

	@RequestMapping("entergrade")
	String entergrade(@RequestParam("grade1") Double grade1,
			@RequestParam("grade2") Double grade2,
			@RequestParam("grade3") Double grade3,
			@RequestParam("grade4") Double grade4) {
		if (grade1.toString() != "" && grade2.toString() != ""
				&& grade3.toString() != "" && grade4.toString() != "") {
			basesalaryRepository.deleteAll();
			BaseSalary basesalary1 = new BaseSalary(1, grade1);
			BaseSalary basesalary2 = new BaseSalary(2, grade2);
			BaseSalary basesalary3 = new BaseSalary(3, grade3);
			BaseSalary basesalary4 = new BaseSalary(4, grade4);
			basesalaryRepository.save(basesalary1);
			basesalaryRepository.save(basesalary2);
			basesalaryRepository.save(basesalary3);
			basesalaryRepository.save(basesalary4);
			return "register_success";
		}
		return null;
	}

	@ResponseBody
	@RequestMapping("loup_papname")
	public List loup_papname(@RequestParam("key") String key) {

		List<ExtraSalary> list = salaryRepository.findByNameContaining(key);
		System.out.println(list.size() + "size");
		return list;
	}

	@ResponseBody
	@RequestMapping("loup_papid")
	public ExtraSalary loup_papid(@RequestParam("keyid") Long key) {
		ExtraSalary exsal = salaryRepository.findOne(key);
		return exsal;
	}

	@ResponseBody
	@RequestMapping("lookupsal")
	EmployeeSalary allSalary(@RequestParam("lookupsalkey") String lookupsalkey,
			HttpSession session) {
		double extra = 0;
		double base = 0;
		int grade = 0;
		Long userid = (Long) session.getAttribute("username");
		System.out.println(userid + "userid" + lookupsalkey + "lookupsal");
		List<ExtraSalary> salary = salaryRepository.findByUseridAndMonth(
				userid, lookupsalkey);
		if (salary != null) {
			for (int i = 0; i < salary.size(); i++) {
				extra += salary.get(i).getMoney();
				System.out.println("xunhuan");
			}
		}

		Employee employee = employeeRepository.findOne(userid);
		if (employee != null) {
			grade = employee.getGrade();
		}
		BaseSalary basesalary = basesalaryRepository.findByGrade(grade);
		if (basesalary != null) {
			base = basesalary.getBasesalary();
		}
		double allsalary = extra + base;
		System.out.println(base + "base" + allsalary + "all" + extra + "extra");
		EmployeeSalary employeesalary = new EmployeeSalary();
		employeesalary.setAllmoney(allsalary);
		employeesalary.setBasesalary(base);
		employeesalary.setExtramoney(extra);
		employeesalary.setMonth(lookupsalkey);
		employeesalary.setUserid(userid);
		System.out.println(employeesalary);
		return employeesalary;

	}

}
