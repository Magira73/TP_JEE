package com.tpjee.ejb;

import com.tpjee.model.Colis;
import com.tpjee.model.Emplacement;

public interface opProgression {
	
	Colis getColis(int id);
	
	void ajouterEmplacement(Emplacement e);
	
}
