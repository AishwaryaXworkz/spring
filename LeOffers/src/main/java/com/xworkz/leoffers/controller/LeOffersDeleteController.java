package com.xworkz.leoffers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.leoffers.dto.LeOffersDto;
import com.xworkz.leoffers.service.LeOffersService;

@Controller
@RequestMapping("/")
public class LeOffersDeleteController {
	@Autowired	
	LeOffersService service;
public LeOffersDeleteController() {
	System.out.println("this is LeOffersDeleteController");
}
@GetMapping("delete/{id}")
public String deleteById(@PathVariable int id,Model model) {
	System.out.println("this is Delete method");
	System.out.println(id);
	boolean delete=service.deleteById(id);
	if(delete==true) {
		model.addAttribute("success","data deleted successfully");
		return "findall";
	}else {
		model.addAttribute("fail","record not delete");
		return "findall";
	}
}

  @GetMapping("deleteemail") 
 public String deleteByEmail(@RequestParam String email,Model model) { 
  boolean dtos=service.deleteByEmail(email);
 System.out.println("delete email method"+email);
 if(dtos) {
 model.addAttribute("succ","data deleted successfully"); 
 return "findbyemail";
 }else { 
	 model.addAttribute("fails","record not delete");
	 return "findbyemail"; 
 } 
 }
 

	@GetMapping("deleteusername/{userName}")
	public String deleteByUserName(@PathVariable String userName,Model model) {
		System.out.println("delete username method"+userName);
		List<LeOffersDto> dto=service.deleteByUserName(userName);
		model.addAttribute("dtos",dto);
		if(dto!=null) {
			model.addAttribute("success","data of username deleted successfully.....");
			return "findbyusername";
		}else {
			model.addAttribute("fails","record not delete");
			return "findbyusername";
		}
}
	/*@GetMapping("deleteId")
	public String deleteById1(@RequestParam int id,Model model) {
		System.out.println("this is Delete method");
		System.out.println(id);
		boolean delete=service.deleteById(id);
		if(delete==true) {
			model.addAttribute("success","data deleted successfully");
			return "findbyid";
		}else {
			model.addAttribute("fail","record not delete");
			return "findbyid";
		}*/
//}
}
