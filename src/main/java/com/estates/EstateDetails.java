package com.estates;

public class EstateDetails {

	private int bedroom;
	private int bathroom;
	private int area;
	private String description;
	
	public int getBedroom() {
		return bedroom;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	public int getBathroom() {
		return bathroom;
	}
	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EstateDetails(int bedroom, int bathroom, int area, String description) {
		super();
		this.bedroom = bedroom;
		this.bathroom = bathroom;
		this.area = area;
		this.description = description;
	}
	
	public EstateDetails(){}
	
}
