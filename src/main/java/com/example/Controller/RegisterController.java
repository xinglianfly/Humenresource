package com.example.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Employee;
import com.example.domain.Manager;
import com.example.repostitory.EmployeeRepository;
import com.example.repostitory.RegisterRepository;

@Controller
public class RegisterController {

	@Autowired
	RegisterRepository registerReposity;
	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String register(Model model) {
		return "login";
	}

	@RequestMapping("/register")
	public String m() {
		return "register";
	}

	@RequestMapping("/manager_register")
	public String Manager_Register(@RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
		
		
		if (username == "" || password == "") {
			model.addAttribute("errormessage", "请将信息填写完整");
			return "register";
		} else {
			Manager manager = new Manager(username, password);
			registerReposity.save(manager);
			return "register_success";
		}
		
	}

	@RequestMapping("/employee_register")
	public String employee_register() {
		return "employee_register";
	}

	@RequestMapping("manager_login")
	public String Manager_Login(@RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
		String jump = "login";
		List<Manager> manager = registerReposity.findByUsername(username);
		for (int i = 0; i < manager.size(); i++) {
			if (manager.get(i).getPassword().equals(password)) {
				jump = "login_success";
			} else {
				model.addAttribute("errormessage", "用户名或密码错误");
				jump = "login";
			}
		}
		return jump;
	}

	// @RequestMapping(value = "/", method = RequestMethod.POST)
	// public String LoginOrRegister(
	// @RequestParam("loginorregister") String loginOrregister) {
	// if (loginOrregister.equals("login")) {
	// return "manager_register";
	// } else {
	// return "manager_register";
	// }
	// }
	@RequestMapping(value = "/emregis", method = RequestMethod.POST)
	public String addEmployee(@RequestParam("username") String username,
			@RequestParam("sex") String sex,
			@RequestParam("email") String email,
			@RequestParam("age") String age,
			@RequestParam("telnumber") String telnumner,
			@RequestParam("department") String department,
			@RequestParam("job") String job,
			@RequestParam("ifwork") String ifwork,
			@RequestParam("training") String training,
			@RequestParam("grade")int grade,
			@RequestParam("skills") String skills, Model model) {

		if (username == "" || sex == "" || age == "" || email == ""
				|| telnumner == "" || department == "" || job == ""
				|| training == "" || skills == "") {
			model.addAttribute("errormessage", "请将信息填写完整");
			return "employee_register";
		} else {
			Employee employee = new Employee();
			employee.setName(username);
			employee.setSex(sex);
			employee.setAge(age);
			employee.setEmail(email);
			employee.setTel(telnumner);
			employee.setDepartment(department);
			employee.setJob(job);
			employee.setIfwork(ifwork);
			employee.setGrade(grade);
			// System.out.println(new Date()+"new DATE");
			employee.setEnterTime(new Date());
			employee.setTraining(training);
			employee.setSkills(skills);
			employeeRepository.save(employee);

			return "register_success";
		}
	}

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	@ResponseBody
	public String managerRegister() {
		return "helo";
	}

}
