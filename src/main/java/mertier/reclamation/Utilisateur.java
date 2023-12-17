package mertier.reclamation;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



	
	@Entity @Table(name="utilisateur")
	@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
	@DiscriminatorColumn( name="discriminator", discriminatorType = DiscriminatorType.STRING )
	public abstract class Utilisateur implements Serializable {

		@Id
		@Column(name = "id", table = "utilisateur")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		@Column(name = "email", table = "utilisateur")
		String email;
		@Column(name = "password")
		String password;
		@Column(name = "actif")
		Boolean actif;
		private static final long serialVersionUID = 1L;

		public Utilisateur() {
			super();
		}
	   
}
