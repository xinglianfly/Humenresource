package com.example.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Signone;
import com.example.mail.OrderMessage;
import com.example.repostitory.SignRepository;

@Controller
public class SignController {
	@Autowired
	SignRepository signRepository;
	
	

	@RequestMapping("onesign")
	String signone(HttpSession session) {

		Signone signone = new Signone();
		signone.setDate(new Date());
		System.out.println(session.getAttribute("username"));
		signone.setUserid((Long) session.getAttribute("username"));
		signone.setIfsign("1");
		signone.setMonth(String.valueOf(new Date().getMonth()+1));
		signRepository.save(signone);
		return "register_success";
	}

	@RequestMapping("lookupsign")
	@ResponseBody
	List lookupsign(@RequestParam("lookupsigs") String months,
			HttpSession session) {
		System.out.println(months + "month");
		Long userid = (Long) session.getAttribute("username");
		List<Signone> list = signRepository
				.findByUseridAndMonth(userid, months);
		System.out.println(list.size()+"list.size");
		if (list!= null) {
			return list;
		} else {
			return null;
		}
	}

	
	@RequestMapping("lookuponesign")
	String lookupsign(){
		return "lookupsign";
	}
	
	@RequestMapping("lookupsignmana")
	@ResponseBody
	List<Signone> lookupsign_manager(@RequestParam("lookupsignidmana")Long id,@RequestParam("lookupsignmonthmana")String month){
		List<Signone>list = signRepository.findByUseridAndMonth(id, month);
		return list;
	}
	
	@RequestMapping("lookuponesignall")
	String lookuponesignall(Model model){
		List<Signone>list = signRepository.findAll();
		
		model.addAttribute("lookuponesignall", list);
		model.addAttribute("lookuponesignallsize", (list.size()+1)/2);
		System.out.println(list+"PPP");
		return "lookuponesignall";
	}
	
	@RequestMapping("lookpagesign")
	String PageList(Pageable pageNo,Model model){
		Page<Signone> pagetext = signRepository.findAll(pageNo);
		model.addAttribute("lookuponesignallsize", pagetext.getTotalPages());
		System.out.println(pagetext.getTotalPages()+"pagetext");
		model.addAttribute("lookuponesignall",pagetext.getContent() );
		return "lookuponesignall";
	}
}
