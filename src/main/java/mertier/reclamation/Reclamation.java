package mertier.reclamation;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Reclamation
 *
 */
@Entity @Table(name="reclamation")

public class Reclamation implements Serializable {

	
	@Id
	@Column(name = "idRec")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idRec;
	@Column(name = "titre")
	String titre;
	@Column(name = "description")
	String description;
	@ManyToOne @JoinColumn(name="idRec", nullable=false)
    private Etudiant etudiant;
	@ManyToOne @JoinColumn(name="idRec", nullable=false)
    private typeReclamation typereclamation;
  public Reclamation (String titre, String des)
  {
	  this.titre=titre;
	  this.description=des;
  }
	public int getIdRec() {
		return idRec;
	}

	public void setIdRec(int idRec) {
		this.idRec = idRec;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	private static final long serialVersionUID = 1L;

	public Reclamation() {
		super();
	}
   
}
