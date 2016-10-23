package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer productId;
	private Protype protype;
	private String productName;
	private String productStyle;
	private Long poductRice;
	private Integer productLow;
	private Integer valid;
	private Integer alarmdays;
	private Set takeouts = new HashSet(0);
	private Set proinstores = new HashSet(0);
	private Set storeins = new HashSet(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Protype protype, String productName, Integer valid, Integer alarmdays) {
		this.protype = protype;
		this.productName = productName;
		this.valid = valid;
		this.alarmdays = alarmdays;
	}

	/** full constructor */
	public Product(Protype protype, String productName, String productStyle, Long poductRice, Integer productLow,
			Integer valid, Integer alarmdays, Set takeouts, Set proinstores, Set storeins) {
		this.protype = protype;
		this.productName = productName;
		this.productStyle = productStyle;
		this.poductRice = poductRice;
		this.productLow = productLow;
		this.valid = valid;
		this.alarmdays = alarmdays;
		this.takeouts = takeouts;
		this.proinstores = proinstores;
		this.storeins = storeins;
	}

	// Property accessors

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Protype getProtype() {
		return this.protype;
	}

	public void setProtype(Protype protype) {
		this.protype = protype;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductStyle() {
		return this.productStyle;
	}

	public void setProductStyle(String productStyle) {
		this.productStyle = productStyle;
	}

	public Long getPoductRice() {
		return this.poductRice;
	}

	public void setPoductRice(Long poductRice) {
		this.poductRice = poductRice;
	}

	public Integer getProductLow() {
		return this.productLow;
	}

	public void setProductLow(Integer productLow) {
		this.productLow = productLow;
	}

	public Integer getValid() {
		return this.valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public Integer getAlarmdays() {
		return this.alarmdays;
	}

	public void setAlarmdays(Integer alarmdays) {
		this.alarmdays = alarmdays;
	}

	public Set getTakeouts() {
		return this.takeouts;
	}

	public void setTakeouts(Set takeouts) {
		this.takeouts = takeouts;
	}

	public Set getProinstores() {
		return this.proinstores;
	}

	public void setProinstores(Set proinstores) {
		this.proinstores = proinstores;
	}

	public Set getStoreins() {
		return this.storeins;
	}

	public void setStoreins(Set storeins) {
		this.storeins = storeins;
	}

}