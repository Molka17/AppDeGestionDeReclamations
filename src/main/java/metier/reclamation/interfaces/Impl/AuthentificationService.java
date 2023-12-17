package metier.reclamation.interfaces.Impl;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import mertier.reclamation.*;
import metier.reclamation.interfac.AuthentificationServiceLocal;



/**
 * Session Bean implementation class AuthentificationService
 */
@Stateless
//@LocalBean
public class AuthentificationService implements AuthentificationServiceLocal {

	@PersistenceContext(unitName="JPApart")
    EntityManager em;
    public AuthentificationService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Utilisateur authentifier(String login, String pwd) {
		Query req = em.createQuery("select e from Etudiant u where u.email=:m and u.password:=p");
		req.setParameter("m", login);
		req.setParameter("p", pwd);
		Utilisateur u=(Utilisateur) req.getSingleResult();
		return u;
	}

	@Override
	public boolean existeEmail(String login) {
		Query req = em.createQuery("select e from Administrateur e where e.email=:m");
		req.setParameter("m", login);
		Utilisateur u=(Utilisateur) req.getSingleResult();
		if(u==null) {
			return false;
		}
		return true;
	}

	

	@Override
	public List<Etudiant> listerEtudiants() {
		return  em.createQuery("select e from etudiant e").getResultList();
	
	}


	@Override
	public void sauvegarderUtilisateur(Utilisateur utilisateur) {
		em.persist(utilisateur);
		
	}

}
