package com.xworkz.leoffers.service;

import java.util.List;

import com.xworkz.leoffers.dto.LeOffersDto;



public interface LeOffersService {
abstract boolean onSave(LeOffersDto dto);
public List<LeOffersDto> findAll();
public abstract LeOffersDto findById(int id);
public abstract List<LeOffersDto> findByUserName(String userName);
public abstract List<LeOffersDto> findByEmail(String email);
public abstract List<LeOffersDto> findByPhoneNumber(long phoneNumber);
public abstract List<LeOffersDto> findByAddress(String address);
public abstract List<LeOffersDto> findByProductName(String productName);
public abstract List<LeOffersDto> findByPrice(double price);
public abstract boolean deleteById(int id);
public abstract boolean deleteByEmail(String email);
public abstract List<LeOffersDto> deleteByUserName(String userName);
abstract boolean onUpdate(LeOffersDto dto);
abstract boolean onUpdateEmail(String email);
public LeOffersDto checkLogin(String email,String password);

}
