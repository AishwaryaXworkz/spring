package com.xworkz.leoffers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.leoffers.dto.LeOffersDto;
import com.xworkz.leoffers.service.LeOffersService;


@Controller
@RequestMapping("/")

public class LeOffersUpdateController {
	@Autowired	
	LeOffersService service;
	public LeOffersUpdateController() {
		System.out.println("this is LeOffersUpdateController");
	}
	@GetMapping("update")
	public String updateById(@RequestParam int id ,Model model) {
		System.out.println("id"+id);
		LeOffersDto dto=service.findById(id);
		if(dto==null) {
			model.addAttribute("message","data not found");
			return "update";
		}else {
			model.addAttribute("dto",dto);
			return "update";
		}
		
	}
	@PostMapping("update")
	public String update(@ModelAttribute LeOffersDto dto,Model model) {
		boolean update=service.onUpdate(dto);
		System.out.println(update);
		if(update!=false) {
			model.addAttribute("update","update is done");
			return "findall";
		}else {
			model.addAttribute("updatedmessage","update is not done");
		
			return "update";
		}
		
	}
	
	
	
	
	@GetMapping("updateEmail")
	public String updateByEmail(@RequestParam String email ,Model model) {
		System.out.println("email"+email);
		List<LeOffersDto> dto=service.findByEmail(email);
		if(dto==null) {
			model.addAttribute("email","data not found");
			return "updatebyemail";
		}else {
			model.addAttribute("dto",dto);
			return "updatebyemail";
		}
		
	}
	@GetMapping("signin")
	public String onLogin(@RequestParam String email, @RequestParam String password, Model model) {
		LeOffersDto dto = service.checkLogin(email, password);
		if (dto != null) {
			model.addAttribute("Dto", dto);
			return "profile";
		} else {
			model.addAttribute("err", "Invalid email or password");
			return "login";
		}
	}
	

}
