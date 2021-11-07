package com.tpjee.ejb;

import com.tpjee.model.Colis;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class opSuiviBean implements opSuivi{

	@Override
	public Colis getColis(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
