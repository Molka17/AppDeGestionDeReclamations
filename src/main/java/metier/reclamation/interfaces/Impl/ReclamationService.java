package metier.reclamation.interfaces.Impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mertier.reclamation.*;
import metier.reclamation.interfac.ReclamationServiceLocal;

import javax.persistence.*;

/**
 * Session Bean implementation class ReclamationService
 */
@Stateless  //(mappedName = "ReclamationService")
//@LocalBean
public class ReclamationService implements ReclamationServiceLocal {
	@PersistenceContext(unitName="JPApart")
    EntityManager em;
    public ReclamationService() {
      
    }

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return "ok";
	}

	@Override
	public void ajouterReclamation(Reclamation reclamation) {
		em.persist(reclamation);
		
	}

	@Override
	public void ajouterTypeReclamation(typeReclamation typeReclamation) {
		em.persist(typeReclamation);
		
	}

	@Override
	public List<Reclamation> listerReclamations() {
		return em.createQuery("select r from reclamation as r").getResultList();
		
		
	}

	@Override
	public List<typeReclamation> listerTypeReclamations() {
		
		return  em.createQuery("select t from typeReclamation t").getResultList();
		}
	
	

	@Override
	public boolean existeTypeReclalamtion(String type) {
		Query req = (Query) em.createQuery("select tr from typeReclamation as tr where tr.type:=t");
		((javax.persistence.Query) req).setParameter("t", type);
		if( (boolean) ((javax.persistence.Query) req).getSingleResult())
		{
			return true;
		}
		return false;
	}

	@Override
	public typeReclamation chercherTypeReclamationParType(String type) {
		typeReclamation t=em.find(typeReclamation.class, type);
		return t;
	
	}

	@Override
	public List<Reclamation> listerReclamationParEtudiant(Etudiant etudiant) {
		
		Query req=(Query) em.createQuery ("select t from typeReclamation t where t.etudiant=:x");
		((javax.persistence.Query) req).setParameter("x", etudiant);
		return ((javax.persistence.Query) req).getResultList(); 
	}

	

}
