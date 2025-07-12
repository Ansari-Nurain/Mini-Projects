package com.employee_menegament.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String state;
	private String city;
	
	
	@OneToOne(mappedBy = "address")
	private Employee employee;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(long id, String state, String city) {
		super();
		this.id = id;
		this.state = state;
		this.city = city;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", state=" + state + ", city=" + city + "]";
	}
	
	

}
