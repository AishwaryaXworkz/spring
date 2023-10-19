package com.xworkz.rto.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.rto.dto.RtoDto;


public interface RtoService {
	public Set<ConstraintViolation<RtoDto>> onSave(RtoDto dto);
	public List<RtoDto> findAll();
}
