package com.tpjee.model;

public class Lieu {
	protected double latitude;
	protected double longitude;
	protected String emplacement;
	
	public Lieu(double latitude, double longitude, String emplacement) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.emplacement = emplacement;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public String getEmplacement() {
		return emplacement;
	}
	
	
	
	
}
