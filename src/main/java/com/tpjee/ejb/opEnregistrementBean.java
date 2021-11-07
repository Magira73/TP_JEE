package com.tpjee.ejb;

import com.tpjee.model.Colis;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class opEnregistrementBean implements opEnregistrement {

	@Override
	public Colis ajouterColis(double poid, String val) {
		// TODO Auto-generated method stub
		return null;
	}

}
