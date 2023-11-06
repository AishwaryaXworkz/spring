package com.xworkz.leoffers.repository;

import java.util.List;

import com.xworkz.leoffers.dto.LeOffersDto;
import com.xworkz.leoffers.entity.LeOffersEntity;


public interface LeOffersRepository {
	abstract boolean onSave(LeOffersDto dto);
    public List<LeOffersEntity> findAll();
    public abstract  LeOffersEntity findById(int id);
    public abstract List<LeOffersEntity> findByUserName(String userName);
    public abstract List<LeOffersEntity> findByEmail(String email);
    public abstract List<LeOffersEntity> findByPhoneNumber(long phoneNumber);
    public abstract List<LeOffersEntity> findByAddress(String address);
    public abstract List<LeOffersEntity> findByProductName(String productName);
    public abstract List<LeOffersEntity> findByPrice(double price);
    public boolean deleteById(int id);
	public abstract boolean deleteByEmail(String email); 
	public abstract List<LeOffersEntity> deleteByUserName(String userName); 
	abstract boolean onUpdate(LeOffersDto dto);
	abstract boolean onUpdateEmail(String email);
	public LeOffersEntity checkLogin(String email,String password);
}
