package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Protype entity. @author MyEclipse Persistence Tools
 */

public class Protype implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String typeName;
	private Integer upperId;
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public Protype() {
	}

	/** minimal constructor */
	public Protype(String typeName, Integer upperId) {
		this.typeName = typeName;
		this.upperId = upperId;
	}

	/** full constructor */
	public Protype(String typeName, Integer upperId, Set products) {
		this.typeName = typeName;
		this.upperId = upperId;
		this.products = products;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getUpperId() {
		return this.upperId;
	}

	public void setUpperId(Integer upperId) {
		this.upperId = upperId;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}