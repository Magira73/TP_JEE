package com.tpjee.model;

import java.io.Serializable;

public class Colis implements Serializable{
	public static int ID = 0;
	private int id = ID++;
	private double poids;
	private String val;
	private Emplacement origine;
	private Emplacement destination;
	
	public Colis() {
		id = ID++;
		poids = 0;
		val = "";
		origine = null;
		destination = null;
	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public void setOrigine(Emplacement origine) {
		this.origine = origine;
	}

	public void setDestination(Emplacement destination) {
		this.destination = destination;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}


	public double getPoids() {
		return poids;
	}

	public String getVal() {
		return val;
	}

	public Emplacement getOrigine() {
		return origine;
	}

	public Emplacement getDestination() {
		return destination;
	}
	
	
}