package mertier.reclamation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity 
@DiscriminatorValue("ET")
public class Etudiant extends Utilisateur implements Serializable {
	
	@Column(name = "nom")
	String nom;
	@Column(name = "prenom")
	String prenom;
	
	 @OneToMany( targetEntity=Reclamation.class, mappedBy="etudiant" )
	    private List<Reclamation> reclamations = new ArrayList<>();
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	private static final long serialVersionUID = 1L;

	public Etudiant() {
		super();
	}
   
}
