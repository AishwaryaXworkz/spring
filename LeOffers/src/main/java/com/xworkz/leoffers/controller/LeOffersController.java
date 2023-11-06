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

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class LeOffersController {
@Autowired	
LeOffersService service;

public LeOffersController() {
	System.out.println("this is LeOffersController");
}
@PostMapping("/save")

public String onSave(@ModelAttribute LeOffersDto dto,Model model) {
	System.out.println("leoffers details");
	model.addAttribute("Dto",dto);
	System.out.println("Dto"+dto);
	model.addAttribute("success","registration done successfully...");
	service.onSave(dto);
	return "login";
	
}
@GetMapping("findAll")
public String findAll(Model model) {
	List<LeOffersDto> dto=service.findAll();
	//if(dto!=null) {
	log.info(dto.toString());
		model.addAttribute("dtos",dto);
		return "findall";
//	}
//	else {
//		model.addAttribute("message","no records");
//		return "findall";
	//}
}
@GetMapping("/findbyid")
public String findById(@RequestParam int id,Model model) {
	System.out.println(id);
	LeOffersDto dto=service.findById(id);
	model.addAttribute("Dto",dto);
	System.out.println("values"+dto);
	return "findbyid";
}
@GetMapping	("findbyusername")
public String findByUserName(@RequestParam String userName,Model model) {
	List<LeOffersDto> dto=service.findByUserName(userName);
	model.addAttribute("dtos",dto);
	return "findbyusername";
}
@GetMapping	("findbyemail")
public String findByEmail(@RequestParam String email,Model model) {
	List<LeOffersDto> dto=service.findByEmail(email);
	model.addAttribute("dtos",dto);
	return "findbyemail";
}
@GetMapping	("findbyphonenumber")
public String findByPhoneNumber(@RequestParam long phoneNumber,Model model) {
	List<LeOffersDto> dto=service.findByPhoneNumber(phoneNumber);
	model.addAttribute("dtos",dto);
	return "findbyphonenumber";
}
@GetMapping	("findbyaddress")
public String findByAddress(@RequestParam String address,Model model) {
	List<LeOffersDto> dto=service.findByAddress(address);
	model.addAttribute("dtos",dto);
	return "findbyaddress";
}
@GetMapping	("findbyproductname")
public String findByProductName(@RequestParam String productName,Model model) {
	List<LeOffersDto> dto=service.findByProductName(productName);
	model.addAttribute("dtos",dto);
	return "findbyproductname";
}
@GetMapping	("findbyprice")
public String findByPrice(@RequestParam double price,Model model) {
	List<LeOffersDto> dto=service.findByPrice(price);
	model.addAttribute("dtos",dto);
	return "findbyprice";
}
}
