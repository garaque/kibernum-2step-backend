package com.shop.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="purchase_product")
public class PurchaseProduct {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer quantity;
    private Double price;
    private Double total; 
    
    @ManyToOne
    private Product product;
    
    @ManyToOne
    private Purchase purchase;

    
    
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getQuantity() {
		return quantity;
	}



	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Double getTotal() {
		return total;
	}



	public void setTotal(Double total) {
		this.total = total;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public Purchase getPurchase() {
		return purchase;
	}



	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}



	@Override
	public String toString() {
		return "PurchaseProduct [id=" + id + ", quantity=" + quantity + ", price=" + price + ", total=" + total
				+ ", product=" + product + ", purchase=" + purchase + "]";
	}
    
    
    
    
}
