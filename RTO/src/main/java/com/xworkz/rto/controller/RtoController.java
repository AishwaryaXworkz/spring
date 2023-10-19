package com.xworkz.rto.controller;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.xworkz.rto.dto.RtoDto;
import com.xworkz.rto.service.RtoService;

@Controller
@RequestMapping("/")

public class RtoController {
	@Autowired
	RtoService service;

public RtoController() {
System.out.println("this is RtoController");
}

@PostMapping("/save")
public String onSave(@ModelAttribute RtoDto dto,Model model) {
	List<RtoDto>  dto2=service.findAll();
	for(RtoDto rtodto:dto2) {
		if(rtodto.getEmail().equalsIgnoreCase(dto.getEmail())) {
			model.addAttribute("err","Email is already exists");
			return "signup";
		}else {
	System.out.println("Rto details");
	model.addAttribute("Dto",dto);
	System.out.println("Dto"+dto);
	Set<ConstraintViolation<RtoDto>> voilations=service.onSave(dto);
	if(voilations.isEmpty()) {
		model.addAttribute("message", "No Voilation it is valid data");
		return "success";
	}else {
		model.addAttribute("voilations", voilations);
		return "signup";
	}
}
	}
	return "signup";
}


@GetMapping("findAll")
public String findAll(Model model) {
	List<RtoDto> dto=service.findAll();
	
	System.out.println(dto.toString());
		model.addAttribute("dtos",dto);
		return "findall";
}
}
