package metier.reclamation.interfaces.Impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mertier.reclamation.Etudiant;
import metier.reclamation.interfac.EtudiantServiceLocal;



@Stateless
//@LocalBean
public class EtudiantService implements EtudiantServiceLocal {
	@PersistenceContext(unitName="JPApart")
    EntityManager em;
   
    public EtudiantService() {
        
    }

	

	@Override
	public void activerCompteEtudiant(Etudiant e) {
		Query req = em.createQuery("update Etudiant e set e.actif:=etat ");
		req.setParameter("atat", 1);
		
		
	}

	@Override
	public void desactiverCompteEtudiant(Etudiant e) {
		Query req = em.createQuery("update Etudiant e set e.actif:=etat ");
		req.setParameter("etat", 0);
		
	}

}
