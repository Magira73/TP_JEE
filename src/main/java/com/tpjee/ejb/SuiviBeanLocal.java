package com.tpjee.ejb;

import javax.ejb.Local;

import com.tpjee.model.Colis;

//@Local
public interface SuiviBeanLocal {
	
	Colis getColis(Long id);
}
