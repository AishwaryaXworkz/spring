package com.xworkz.rto.repository;

import java.util.List;

import com.xworkz.rto.dto.RtoDto;
import com.xworkz.rto.entity.RtoEntity;

public interface RtoRepository {
public abstract boolean onSave(RtoDto dto);
public List<RtoEntity> findAll();
}
