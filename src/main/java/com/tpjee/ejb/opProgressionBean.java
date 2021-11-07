package com.tpjee.ejb;

import com.tpjee.model.Colis;
import com.tpjee.model.Emplacement;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class opProgressionBean implements opProgression{

	@Override
	public Colis getColis(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterEmplacement(Emplacement e) {
		// TODO Auto-generated method stub
		
	}

}
