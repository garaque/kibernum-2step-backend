package com.shop.api.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date date;
    private Double total;
    
    @ManyToOne
    private Customer customer;
    
    @OneToMany
    private List<PurchaseProduct> purchaseProduct;
    
    

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public Double getTotal() {
		return total;
	}



	public void setTotal(Double total) {
		this.total = total;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public List<PurchaseProduct> getPurchaseProduct() {
		return purchaseProduct;
	}



	public void setPurchaseProduct(List<PurchaseProduct> purchaseProduct) {
		this.purchaseProduct = purchaseProduct;
	}



	@Override
	public String toString() {
		return "Purchase [id=" + id + ", date=" + date + ", total=" + total + ", customer=" + customer
				+ ", purchaseProduct=" + purchaseProduct + "]";
	}
    
    
    
    
}
