package com.entity;

/**
 * Proinstore entity. @author MyEclipse Persistence Tools
 */

public class Proinstore implements java.io.Serializable {

	// Fields

	private Integer proinstoreId;
	private Storehouse storehouse;
	private Product product;
	private Long proinstorePrice;
	private Integer proinstoreNum;
	private String makedate;

	// Constructors

	/** default constructor */
	public Proinstore() {
	}

	/** minimal constructor */
	public Proinstore(Storehouse storehouse, Product product, String makedate) {
		this.storehouse = storehouse;
		this.product = product;
		this.makedate = makedate;
	}

	/** full constructor */
	public Proinstore(Storehouse storehouse, Product product, Long proinstorePrice, Integer proinstoreNum,
			String makedate) {
		this.storehouse = storehouse;
		this.product = product;
		this.proinstorePrice = proinstorePrice;
		this.proinstoreNum = proinstoreNum;
		this.makedate = makedate;
	}

	// Property accessors

	public Integer getProinstoreId() {
		return this.proinstoreId;
	}

	public void setProinstoreId(Integer proinstoreId) {
		this.proinstoreId = proinstoreId;
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

	public Long getProinstorePrice() {
		return this.proinstorePrice;
	}

	public void setProinstorePrice(Long proinstorePrice) {
		this.proinstorePrice = proinstorePrice;
	}

	public Integer getProinstoreNum() {
		return this.proinstoreNum;
	}

	public void setProinstoreNum(Integer proinstoreNum) {
		this.proinstoreNum = proinstoreNum;
	}

	public String getMakedate() {
		return this.makedate;
	}

	public void setMakedate(String makedate) {
		this.makedate = makedate;
	}

}