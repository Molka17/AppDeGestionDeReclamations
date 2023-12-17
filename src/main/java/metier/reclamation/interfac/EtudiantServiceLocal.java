package metier.reclamation.interfac;

import javax.ejb.Local;

import mertier.reclamation.Etudiant;

import java.util.List;





@Local
public interface EtudiantServiceLocal {
void activerCompteEtudiant(Etudiant e);
void desactiverCompteEtudiant(Etudiant e);


}
