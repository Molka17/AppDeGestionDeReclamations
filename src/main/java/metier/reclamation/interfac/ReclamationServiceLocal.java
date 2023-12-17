package metier.reclamation.interfac;

import java.util.List;

import javax.ejb.Local;

import mertier.reclamation.*;



@Local
public interface ReclamationServiceLocal {
	 public String greeting();
	
	void ajouterReclamation(Reclamation reclamation);
	void ajouterTypeReclamation(typeReclamation typeReclamation);
	List<Reclamation> listerReclamations();
	List<typeReclamation> listerTypeReclamations();
	boolean existeTypeReclalamtion(String type);
	typeReclamation chercherTypeReclamationParType(String type);
	List<Reclamation> listerReclamationParEtudiant(Etudiant etudiant);

}
