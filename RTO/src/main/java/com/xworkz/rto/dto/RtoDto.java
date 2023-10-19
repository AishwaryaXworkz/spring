package com.xworkz.rto.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RtoDto {
private int id;

@Size(min=3,max=30,message="check the firstName length,min=3 and max=30")
@NotNull
@NotEmpty
@NotBlank  
private String firstName;


@NotNull
@NotEmpty
@NotBlank 
private String lastName;


private String password;
private String confirmPassword;
private String dob;

@Positive
private long phoneNumber;

@NotNull
@NotEmpty
@NotBlank 
@Email
private String email;

}
