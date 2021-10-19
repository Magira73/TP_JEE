package com.tpjee.model;

public class Emplacement extends Lieu{
	private int etat;

	public Emplacement(double latitude, double longitude, String emplacement, int etat) {
		super(latitude, longitude, emplacement);
		this.etat = etat;
	}

	public int getEtat() {
		return etat;
		
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	
}
