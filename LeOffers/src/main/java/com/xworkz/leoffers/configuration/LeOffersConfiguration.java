package com.xworkz.leoffers.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class LeOffersConfiguration {
public LeOffersConfiguration() {
	System.out.println("this is LeOffersConfiguration");
}
}
