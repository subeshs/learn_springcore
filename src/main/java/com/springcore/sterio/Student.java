package com.springcore.sterio;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("subesh")
	private String Name;
	@Value("delhi")
	private String city;
	@Value("#{irs}")
	private List<String> address;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", city=" + city + ", address=" + address + "]";
	}
	
	
}
