package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Storehouse entity. @author MyEclipse Persistence Tools
 */

public class Storehouse implements java.io.Serializable {

	// Fields

	private Integer storehouseId;
	private String storehouseName;
	private String memo;
	private Set takeouts = new HashSet(0);
	private Set proinstores = new HashSet(0);
	private Set storeins = new HashSet(0);

	// Constructors

	/** default constructor */
	public Storehouse() {
	}

	/** minimal constructor */
	public Storehouse(String storehouseName) {
		this.storehouseName = storehouseName;
	}

	/** full constructor */
	public Storehouse(String storehouseName, String memo, Set takeouts, Set proinstores, Set storeins) {
		this.storehouseName = storehouseName;
		this.memo = memo;
		this.takeouts = takeouts;
		this.proinstores = proinstores;
		this.storeins = storeins;
	}

	// Property accessors

	public Integer getStorehouseId() {
		return this.storehouseId;
	}

	public void setStorehouseId(Integer storehouseId) {
		this.storehouseId = storehouseId;
	}

	public String getStorehouseName() {
		return this.storehouseName;
	}

	public void setStorehouseName(String storehouseName) {
		this.storehouseName = storehouseName;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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