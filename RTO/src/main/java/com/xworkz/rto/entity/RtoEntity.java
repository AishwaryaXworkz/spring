package com.xworkz.rto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="rto_info")
@Data
@NamedQueries({
@NamedQuery(name="FindAll",query="select entity from RtoEntity entity"),
@NamedQuery(name="FindByEmail",query="select entity from  RtoEntity entity where entity.email=:em")
})
public class RtoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="ConfirmPassword")
	private String confirmPassword;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="PhoneNumber")
	private long phoneNumber;
	
	@Column(name="Email")
	private String email;
}
