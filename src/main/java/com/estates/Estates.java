package com.estates;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estates {

	@Id
	private int id;
	private String propertyType;
	private String price;
	
	//private EstateDetails estateDetails;
	private String imgLocation;
	private String address;
	public Estates(){
		
		
	}
	
	
	public Estates(String propertyType, String price, int id, EstateDetails estateDetails, String imgLocation, String address) {
		super();
		this.propertyType = propertyType;
		this.price = price;
		this.id = id;
		//this.estateDetails = estateDetails;
		this.imgLocation = imgLocation;
		this.address = address;
	}


	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public EstateDetails getEstateDetails() {
//		return estateDetails;
//	}
//
//	public void setEstateDetails(EstateDetails estateDetails) {
//		this.estateDetails = estateDetails;
//	}


	public String getImgLocation() {
		return imgLocation;
	}


	public void setImgLocation(String imgLocation) {
		this.imgLocation = imgLocation;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Estates [id=" + id + ", propertyType=" + propertyType + ", price=" + price + ", estateDetails="
				 + ", imgLocation=" + imgLocation + ", address=" + address + "]";
	}

	
}
