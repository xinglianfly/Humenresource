package com.example.Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Employee;
import com.example.domain.EmployeeRegister;
import com.example.form.EmployeeRegisterForm;
import com.example.mail.OrderMessage;
import com.example.repostitory.Em_RegisterRespository;
import com.example.repostitory.EmployeeRepository;

@Controller
public class SendemailController {

	@Autowired
	OrderMessage ordermessage;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	Em_RegisterRespository em_registerRepostitory;

	@RequestMapping("sendemailpage")
	String sendEmailpage() {
		return "sendemail";
	}

	@RequestMapping("sendemail")
	String sendEmail(@RequestParam("subject") String subject,
			@RequestParam("mainmessage") String mainMessage) {
		List<Employee> list = employeeRepository.findAll();
		for (int i = 0; i < list.size(); i++) {
			String email = list.get(i).getEmail();
			ordermessage.placeOrder(email, subject, mainMessage);
		}
		return "register_success";
	}

	@RequestMapping("forget_password")
	String forgetPassword() {
		return "forgetpassword";
	}

	@RequestMapping("changepassword")
	String changePassword(@RequestParam("userid") Long userid) {
		if (employeeRepository.findOne(userid)!=null) {
			Employee register = employeeRepository.findOne(userid);
			String email = register.getEmail();
			String main = "请点击以下链接，来修改密码。http://localhost:8080/HumenResourse/findpassword?userid="
					+ md5(String.valueOf(userid)) + "";

			ordermessage.placeOrder(email, "修改密码", main);
			return "register_success";
		} else {
			return "redirect:forgetpassword.jsp";
		}

	}

	@RequestMapping("findpassword")
	String changeSuccess() {
		return "findmypassword";
	}

	private static String md5(String string) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("md5");
			md.update(string.getBytes());
			byte[] md5Bytes = md.digest();
			return bytes2Hex(md5Bytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return null;
	}

	private static String bytes2Hex(byte[] byteArray) {
		StringBuffer strBuf = new StringBuffer();
		for (int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] >= 0 && byteArray[i] < 16) {
				strBuf.append("0");
			}
			strBuf.append(Integer.toHexString(byteArray[i] & 0xFF));
		}
		return strBuf.toString();
	}

	@RequestMapping("lastsetpassword")
	String lastsetPssword(@Valid EmployeeRegisterForm form,
			@RequestParam("userid") Long userid,
			@RequestParam("newPassword") String newPassword,
			@RequestParam("newpassagain") String again) {
		if (newPassword.equals(again)) {
			EmployeeRegister emp = em_registerRepostitory.findOne(userid);
			form.setId(userid);
			form.setPassword(again);
			BeanUtils.copyProperties(form, emp);
			em_registerRepostitory.save(emp);

			return "register_success";
		} else {
			return "redirect:findmypassword.jsp";
		}

	}
}
