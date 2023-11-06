package com.xworkz.leoffers.entity;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="LeOffers_info")
@NamedQueries({
@NamedQuery(name="checkLogin",query="select entity from  LeOffersEntity entity where entity.email=:em and entity.password=:pw"),
@NamedQuery(name="findAll" , query="select entity from LeOffersEntity entity"),
@NamedQuery(name="findByUserName",query="select entity from LeOffersEntity entity where entity.userName=:un"),
@NamedQuery(name="findByEmail",query="select entity from LeOffersEntity entity where entity.email=:em"),
@NamedQuery(name="findByPhoneNumber",query="select entity from LeOffersEntity entity where entity.phoneNumber=:ph"),
@NamedQuery(name="findByAddress",query="select entity from LeOffersEntity entity where entity.address=:addr"),
@NamedQuery(name="findByProductName",query="select entity from LeOffersEntity entity where entity.productName=:prn"),
@NamedQuery(name="findByPrice",query="select entity from LeOffersEntity entity where entity.price=:pr"),
@NamedQuery(name="deleteByEmail",query="delete from LeOffersEntity en where en.email=:email"),
@NamedQuery(name="deleteByName",query="delete from LeOffersEntity where userName=:un"),
@NamedQuery(name="updateByEmail",query="update LeOffersEntity entity set entity.userName=un where entity.email=:em")

})

public class LeOffersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int id;
	private String userName;
	private long phoneNumber;
	private String email;
	private String productName;
	private double price;
	private String address;
	private String features;
	private String discount;
	private String chat;
	private String password;
	private String confirmPassword;
	private LocalDateTime registeredDateTime;
}
