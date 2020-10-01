package com.shop.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String user;
	private String password;
	private String name;
	private String surname;
	private String phone;
	
	
	
	
	
	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getUser() {
		return user;
	}





	public void setUser(String user) {
		this.user = user;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getSurname() {
		return surname;
	}





	public void setSurname(String surname) {
		this.surname = surname;
	}





	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}





	@Override
	public String toString() {
		return "Customer [id=" + id + ", user=" + user + ", password=" + password + ", name=" + name + ", surname="
				+ surname + ", phone=" + phone + "]";
	}
	
	

	
}
