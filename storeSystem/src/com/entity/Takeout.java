package com.entity;

import java.util.Date;

/**
 * Takeout entity. @author MyEclipse Persistence Tools
 */

public class Takeout implements java.io.Serializable {

	// Fields

	private Integer takeoutId;
	private Storehouse storehouse;
	private Product product;
	private Client client;
	private Long takeoutPrice;
	private Integer takeoutProductNum;
	private String username;
	private Date optdate;

	// Constructors

	/** default constructor */
	public Takeout() {
	}

	/** minimal constructor */
	public Takeout(Storehouse storehouse, Product product, Client client, String username) {
		this.storehouse = storehouse;
		this.product = product;
		this.client = client;
		this.username = username;
	}

	/** full constructor */
	public Takeout(Storehouse storehouse, Product product, Client client, Long takeoutPrice, Integer takeoutProductNum,
			String username, Date optdate) {
		this.storehouse = storehouse;
		this.product = product;
		this.client = client;
		this.takeoutPrice = takeoutPrice;
		this.takeoutProductNum = takeoutProductNum;
		this.username = username;
		this.optdate = optdate;
	}

	// Property accessors

	public Integer getTakeoutId() {
		return this.takeoutId;
	}

	public void setTakeoutId(Integer takeoutId) {
		this.takeoutId = takeoutId;
	}

	public Storehouse getStorehouse() {
		return this.storehouse;
	}

	public void setStorehouse(Storehouse storehouse) {
		this.storehouse = storehouse;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Long getTakeoutPrice() {
		return this.takeoutPrice;
	}

	public void setTakeoutPrice(Long takeoutPrice) {
		this.takeoutPrice = takeoutPrice;
	}

	public Integer getTakeoutProductNum() {
		return this.takeoutProductNum;
	}

	public void setTakeoutProductNum(Integer takeoutProductNum) {
		this.takeoutProductNum = takeoutProductNum;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getOptdate() {
		return this.optdate;
	}

	public void setOptdate(Date optdate) {
		this.optdate = optdate;
	}

}