package com.tpjee.ejb;

import javax.ejb.Local;

import com.tpjee.model.Colis;

//@Local
public interface ProgressionBeanLocal {
	
	Colis getColis(Long id);
	
	void ajouterEmplacement(long id, String emplacement);
}
