package com.tpjee.ejb;

import javax.ejb.Local;

import com.tpjee.model.Colis;

//@Local
public interface EnregistrementBeanLocal {
	
	long ajouterColis(double poids, String val, String src, String dest);
	
}
