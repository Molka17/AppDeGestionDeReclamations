package mertier.reclamation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * Entity implementation class for Entity: typeReclamation
 *
 */
@Entity @Table(name="typereclamation")

public class typeReclamation implements Serializable {

	@Id
	@Column(name = "idType", table = "typereclamation")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idType ;
	@Column(name = "type", table = "typereclamation")
	String type;
	
	@OneToMany( targetEntity=Reclamation.class, mappedBy="typereclamation" )
    private List<Reclamation> reclamations = new ArrayList<>();
	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private static final long serialVersionUID = 1L;

	public typeReclamation() {
		super();
	}
   
}

