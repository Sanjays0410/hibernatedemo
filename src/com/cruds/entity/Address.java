package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")

public class Address {

	
	private long addressId;
	private String street;
	private String city;
	private String state;
	private String zipcode;

public Address() {
	// TODO Auto-generated constructor stub
}



public Address( String street, String city, String state, String zipcode) {
	super();
	
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}



@Id
@GeneratedValue
@Column(name = "ADDRESS_ID")
public long getAddressId() {
	return addressId;
}

public void setAddressId(long addressId) {
	this.addressId = addressId;
}

@Column(name = "ADDRESS_STREET", nullable = false, length=250)

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}
@Column(name = "ADDRESS_CITY", nullable = false, length=50)

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
@Column(name = "ADDRESS_STATE", nullable = false, length=50)

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}
@Column(name = "ADDRESS_ZIPCODE", nullable = false, length=10)

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}


}
