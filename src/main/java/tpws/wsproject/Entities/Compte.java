package tpws.wsproject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {
	
	@Id
	private int idCompte;
	
	@Column(name="montant")
	private double montant;
	
	@Column(name="idutilisateur")
	private int idutilisateur;

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public int getIdUser() {
		return idutilisateur;
	}

	public void setIdUser(int idUser) {
		this.idutilisateur = idUser;
	}
	
	

}
