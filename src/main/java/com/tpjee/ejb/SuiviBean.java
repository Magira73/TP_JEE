package com.tpjee.ejb;

import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tpjee.model.Colis;

/**
 * Session Bean implementation class SuiviBean
 */
@Stateless
public class SuiviBean implements SuiviBeanLocal {
	
	@PersistenceContext
    private EntityManager em;

    /**
     * Default constructor. 
     */
    public SuiviBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public Colis getColis(Long id) {    			
    	Colis col = em.find(Colis.class, id);
		return col;
	}

}
