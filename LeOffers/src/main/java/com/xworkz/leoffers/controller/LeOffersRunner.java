package com.xworkz.leoffers.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.leoffers.dto.LeOffersDto;

@Component
@RequestMapping("/")
public class LeOffersRunner {
public LeOffersRunner() {
	System.out.println("this is LeOffersRunner");
}
@PostMapping("/save")
public String onSave(@ModelAttribute LeOffersDto dto,Model model) {
	System.out.println("leoffers details");
	model.addAttribute("Dto",dto);
	System.out.println("Dto"+dto);
	return "success.jsp";
	
}
}
