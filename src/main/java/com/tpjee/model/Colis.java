package com.tpjee.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Colis implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private long id;
	
	private double poids;
	private String val;
	private String origine;
	private String destination;
	private ArrayList<String> emplacements;
	
	public Colis() {
		poids = 0;
		val = "";
		origine = null;
		destination = null;
		emplacements = new ArrayList<String>();
	}
	
	public Colis(double poids, String val, String origine, String destination) {
		this.poids = poids;
		this.val = val;
		this.origine = origine;
		this.destination = destination;
		this.emplacements = new ArrayList<String>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public ArrayList<String> getEmplacements() {
		return emplacements;
	}

	public void setEmplacements(ArrayList<String> emplacements) {
		this.emplacements = emplacements;
	}
	
	public void addEmplacement(String emplacement) {
		emplacements.add(emplacement);
	}


	
}