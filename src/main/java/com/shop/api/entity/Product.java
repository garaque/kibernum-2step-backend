package com.shop.api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private String description;
	private Long quantity;
	private Double price;
	private Date publishDate;
	private Date expirationDate;
	private String img;
	
	
	
	
	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Date getExpirationDate() {
		return expirationDate;
	}




	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Long getQuantity() {
		return quantity;
	}




	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}




	public Double getPrice() {
		return price;
	}




	public void setPrice(Double price) {
		this.price = price;
	}




	public String getImg() {
		return img;
	}




	public void setImg(String img) {
		this.img = img;
	}




	public Date getPublishDate() {
		return publishDate;
	}




	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}




	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + ", publishDate=" + publishDate + ", expirationDate=" + expirationDate + ", img="
				+ img + "]";
	}




	
	
	
}
