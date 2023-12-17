package mertier.reclamation;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import mertier.reclamation.Utilisateur;


@Entity 
@DiscriminatorValue("AD")
public class Administrateur extends Utilisateur implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Administrateur() {
		super();
	}
   
}
