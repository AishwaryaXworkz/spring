package com.xworkz.rto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.rto.dto.RtoDto;
import com.xworkz.rto.entity.RtoEntity;
import com.xworkz.rto.repository.RtoRepository;

@Service
public class RtoServiceImplementation implements RtoService{
	@Autowired	
	RtoRepository repo;
	
	public RtoServiceImplementation() {
		System.out.println("this is RtoServiceImplementation");
	}
	@Override
	public Set<ConstraintViolation<RtoDto>>  onSave(RtoDto dto) {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator valid=factory.getValidator();
		Set<ConstraintViolation<RtoDto>> voilations=valid.validate(dto);
		if(voilations.isEmpty()) {
			repo.onSave(dto);
			System.out.println("Data saved succesfully....");
		}else {
			System.out.println("Voilations are present"+voilations);
			return voilations;
		}
		return voilations;
	
		
	}
	@Override
	public List<RtoDto> findAll() {
		
List<RtoEntity> entityList=repo.findAll();
		
		List<RtoDto> dtoList=new ArrayList<RtoDto>();
		
		for(RtoEntity en:entityList) {
			System.out.println(en);
			RtoDto dto=new RtoDto();
			BeanUtils.copyProperties(en, dto);
			dtoList.add(dto);
		}
		System.out.println(dtoList.toString());
		return dtoList;
	}

}


