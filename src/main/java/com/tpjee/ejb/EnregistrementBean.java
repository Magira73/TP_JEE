package com.tpjee.ejb;

import java.util.ArrayList;

import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tpjee.model.Colis;

/**
 * Session Bean implementation class EnregistrementBean
 */
@Stateless
public class EnregistrementBean implements EnregistrementBeanLocal {
	
	
	@PersistenceContext
    private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public EnregistrementBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public long ajouterColis(double poids, String val, String src, String dest) {
    	Colis col = new Colis(poids, val, src, dest);
    	em.persist(col);
    	
    	return col.getId();
	}
    

}
