package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.service.DemoInterface;
@Component
public class Patient implements DemoInterface{
	@Override
	public String getPatient(String fullName) {
		return "Patient name is : "+fullName;
	}

	@Override
	public String getMedicine(String medicines) {
		return "Your Medicines are: "+medicines;
	}

	@Override
	public String getBills(int amount) {
		
		return "Your total bill is: "+amount;
	}
}
