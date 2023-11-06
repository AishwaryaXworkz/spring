package com.xworkz.leoffers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.xworkz.leoffers.dto.LeOffersDto;
import com.xworkz.leoffers.entity.LeOffersEntity;
import com.xworkz.leoffers.repository.LeOffersRepository;

@Service
public class LeOffersServiceImplementation implements LeOffersService {
@Autowired	
LeOffersRepository repo;
public LeOffersServiceImplementation() {
	System.out.println("this is LeoffersServiceImplementation");
}
	@Override
	public boolean onSave(LeOffersDto dto) {
		System.out.println("this is onsave method");
		repo.onSave(dto);
		return false;
	}
	@Override
	public List<LeOffersDto> findAll() {
		List<LeOffersEntity> entityList=repo.findAll();
		
		List<LeOffersDto> dtoList=new ArrayList<LeOffersDto>();
		
		for(LeOffersEntity en:entityList) {
			System.out.println(en);
			LeOffersDto dto=new LeOffersDto();
			BeanUtils.copyProperties(en, dto);
			dtoList.add(dto);
		}
		System.out.println(dtoList.toString());
		return dtoList;
	}
	@Override
	public LeOffersDto findById(int id) {
		System.out.println("find by id service"+id);
	
		LeOffersDto dto=new LeOffersDto();
		if(id!=0) {
			LeOffersEntity entity=repo.findById(id);
			if(entity!=null) {
				System.out.println("entity is not null");
				BeanUtils.copyProperties(entity,dto);
			}
			else {
				System.out.println("entity is null");
			}
		}
		return dto;
	}
	@Override
	public List<LeOffersDto> findByUserName(String userName) {
		System.out.println("find by name:"+userName);
		List<LeOffersEntity> entityList=repo.findByUserName(userName);
		
List<LeOffersDto> dtoList=new ArrayList<LeOffersDto>();
		
		for(LeOffersEntity en:entityList) {
			System.out.println(en);
			LeOffersDto dto=new LeOffersDto();
			BeanUtils.copyProperties(en,dto );
			dtoList.add(dto);
		}
		System.out.println(dtoList.toString());
		return dtoList;
		
	}
	@Override
	public List<LeOffersDto> findByEmail(String email) {
		
		System.out.println("find by email:"+email);
		List<LeOffersEntity> entityList=repo.findByEmail(email);
		
List<LeOffersDto> dtoList=new ArrayList<LeOffersDto>();
		
		for(LeOffersEntity en:entityList) {
			System.out.println(en);
			LeOffersDto dto=new LeOffersDto();
			BeanUtils.copyProperties(en,dto );
			dtoList.add(dto);
		}
		System.out.println(dtoList.toString());
		return dtoList;
	}
	@Override
	public List<LeOffersDto> findByPhoneNumber(long phoneNumber) {
		System.out.println("find by phoneNumber:"+phoneNumber);
		List<LeOffersEntity> entityList=repo.findByPhoneNumber(phoneNumber);
		
List<LeOffersDto> dtoList=new ArrayList<LeOffersDto>();
		
		for(LeOffersEntity en:entityList) {
			System.out.println(en);
			LeOffersDto dto=new LeOffersDto();
			BeanUtils.copyProperties(en,dto );
			dtoList.add(dto);
		}
		System.out.println(dtoList.toString());
		return dtoList;
	}
	@Override
	public List<LeOffersDto> findByAddress(String address) {
		System.out.println("find by address:"+address);
		List<LeOffersEntity> entityList=repo.findByAddress(address);
		
List<LeOffersDto> dtoList=new ArrayList<LeOffersDto>();
		
		for(LeOffersEntity en:entityList) {
			System.out.println(en);
			LeOffersDto dto=new LeOffersDto();
			BeanUtils.copyProperties(en,dto );
			dtoList.add(dto);
		}
		System.out.println(dtoList.toString());
		return dtoList;	
		
	}
	@Override
	public List<LeOffersDto> findByProductName(String productName) {
		System.out.println("find by productName:"+productName);
		List<LeOffersEntity> entityList=repo.findByProductName(productName);
		
List<LeOffersDto> dtoList=new ArrayList<LeOffersDto>();
		
		for(LeOffersEntity en:entityList) {
			System.out.println(en);
			LeOffersDto dto=new LeOffersDto();
			BeanUtils.copyProperties(en,dto );
			dtoList.add(dto);
		}
		System.out.println(dtoList.toString());
		return dtoList;	
	}
	@Override
	public List<LeOffersDto> findByPrice(double price) {
		System.out.println("find by price:"+price);
		List<LeOffersEntity> entityList=repo.findByPrice(price);
		
List<LeOffersDto> dtoList=new ArrayList<LeOffersDto>();
		
		for(LeOffersEntity en:entityList) {
			System.out.println(en);
			LeOffersDto dto=new LeOffersDto();
			BeanUtils.copyProperties(en,dto );
			dtoList.add(dto);
		}
		System.out.println(dtoList.toString());
		return dtoList;	
		
	}
	@Override
	public boolean deleteById(int id) {
		boolean delete=false;
		if(id!=0) {
			delete=repo.deleteById(id);
			
		}
		if(delete!=true) {
			return false;
		}
		else {
			return true;
		
	}
	}
	@Override
	public boolean deleteByEmail(String email) {
		System.out.println("delete by email");
		boolean  entities=repo.deleteByEmail(email);
		return entities;
	}
	
	@Override
	public List<LeOffersDto> deleteByUserName(String userName) {
		
		List<LeOffersEntity> entityList=	repo.deleteByUserName(userName);
		System.out.println("this is delete username service impl");
List<LeOffersDto> dtoList=new ArrayList<LeOffersDto>();
		
		for(LeOffersEntity en:entityList) {
			System.out.println(en);
			LeOffersDto dto=new LeOffersDto();
			BeanUtils.copyProperties(en,dto );
			dtoList.add(dto);
		}
		System.out.println(dtoList.toString());
		return dtoList;
	}
	@Override
	public boolean onUpdate(LeOffersDto dto) {
		System.out.println("update service method");
		boolean update=false;
		if(dto!=null) {
			 update=repo.onUpdate(dto);	
		}else {
			System.out.println("dto is null");
		}
		
		if(update ==true) {
			return true;
		}else {
			return false;	
		}
		
	}
	@Override
	public boolean onUpdateEmail(String email) {
		System.out.println("updated by email service method");
	
		boolean  entities=repo.onUpdateEmail(email);
		return entities;
	}
	@Override
	public LeOffersDto checkLogin(String email, String password) {

		if (email != null && password != null) {
			LeOffersEntity entity = repo.checkLogin(email, password);
			if (entity != null) {
				LeOffersDto dto = new LeOffersDto();
				BeanUtils.copyProperties(entity, dto);
				if (dto.getEmail().equalsIgnoreCase(email) && dto.getPassword().equals(password)) {
					return dto;
				} else {
					System.out.println("Invalid email or password");
					return null;
				}
			} else {
				System.out.println("Entity is null");
				return null;
			}
		} else {
			System.out.println("email or password is null");
			return null;
		}
	}
	
}

