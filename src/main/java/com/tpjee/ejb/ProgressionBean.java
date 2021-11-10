package com.tpjee.ejb;

import java.util.ArrayList;

import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tpjee.model.Colis;

/**
 * Session Bean implementation class ProgressionBean
 */
@Stateless
public class ProgressionBean implements ProgressionBeanLocal {
	
	
	@PersistenceContext
    private EntityManager em;
    /**
     * Default constructor. 
     */
    public ProgressionBean() {
        // TODO Auto-generated constructor stub
    }
    
	@Override
	public Colis getColis(Long id) {
		Colis col = em.find(Colis.class, id);
		return col;
	}

	@Override
	public void ajouterEmplacement(long id, String emplacement) {
		Colis col = em.find(Colis.class, id);
		col.addEmplacement(emplacement);
		em.flush();
	}


}
