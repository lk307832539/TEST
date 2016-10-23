package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Client entity. @author MyEclipse Persistence Tools
 */

public class Client implements java.io.Serializable {

	// Fields

	private Integer clientId;
	private String clientName;
	private String contact;
	private String address;
	private String postcode;
	private String phone;
	private String memo;
	private Set takeouts = new HashSet(0);
	private Set storeins = new HashSet(0);

	// Constructors

	/** default constructor */
	public Client() {
	}

	/** minimal constructor */
	public Client(String clientName, String contact, String phone) {
		this.clientName = clientName;
		this.contact = contact;
		this.phone = phone;
	}

	/** full constructor */
	public Client(String clientName, String contact, String address, String postcode, String phone, String memo,
			Set takeouts, Set storeins) {
		this.clientName = clientName;
		this.contact = contact;
		this.address = address;
		this.postcode = postcode;
		this.phone = phone;
		this.memo = memo;
		this.takeouts = takeouts;
		this.storeins = storeins;
	}

	// Property accessors

	public Integer getClientId() {
		return this.clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Set getStoreins() {
		return this.storeins;
	}

	public void setStoreins(Set storeins) {
		this.storeins = storeins;
	}

}