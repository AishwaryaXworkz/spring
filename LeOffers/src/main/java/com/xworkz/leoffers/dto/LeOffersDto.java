package com.xworkz.leoffers.dto;



import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LeOffersDto {
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
