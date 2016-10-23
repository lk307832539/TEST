package com.entity;

import java.util.Date;

/**
 * Storein entity. @author MyEclipse Persistence Tools
 */

public class Storein implements java.io.Serializable {

	// Fields

	private Integer storeinId;
	private Storehouse storehouse;
	private Product product;
	private Client client;
	private String makedate;
	private Long storeinPrice;
	private Integer storeinProductNum;
	private Date optdate;
	private String username;

	// Constructors

	/** default constructor */
	public Storein() {
	}

	/** minimal constructor */
	public Storein(Product product, String makedate, Integer storeinProductNum, Date optdate) {
		this.product = product;
		this.makedate = makedate;
		this.storeinProductNum = storeinProductNum;
		this.optdate = optdate;
	}

	/** full constructor */
	public Storein(Storehouse storehouse, Product product, Client client, String makedate, Long storeinPrice,
			Integer storeinProductNum, Date optdate, String username) {
		this.storehouse = storehouse;
		this.product = product;
		this.client = client;
		this.makedate = makedate;
		this.storeinPrice = storeinPrice;
		this.storeinProductNum = storeinProductNum;
		this.optdate = optdate;
		this.username = username;
	}

	// Property accessors

	public Integer getStoreinId() {
		return this.storeinId;
	}

	public void setStoreinId(Integer storeinId) {
		this.storeinId = storeinId;
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

	public String getMakedate() {
		return this.makedate;
	}

	public void setMakedate(String makedate) {
		this.makedate = makedate;
	}

	public Long getStoreinPrice() {
		return this.storeinPrice;
	}

	public void setStoreinPrice(Long storeinPrice) {
		this.storeinPrice = storeinPrice;
	}

	public Integer getStoreinProductNum() {
		return this.storeinProductNum;
	}

	public void setStoreinProductNum(Integer storeinProductNum) {
		this.storeinProductNum = storeinProductNum;
	}

	public Date getOptdate() {
		return this.optdate;
	}

	public void setOptdate(Date optdate) {
		this.optdate = optdate;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}