package tpws.wsproject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")
public class Utilisateur {

	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_utilisateur")
	@SequenceGenerator(name="sequence_utilisateur",sequenceName = "seq_id_utilisateur",allocationSize = 1)
	@Id
	private int id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="username")
	private String username;

	
	@Column(name="mdp")
	private String mdp;

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		
		if(!username.isEmpty()) {
			this.username = username;
		}
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	
}
