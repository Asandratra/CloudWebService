package tpws.wsproject.Entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="enchere")
public class Enchere {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_enchere")
	@SequenceGenerator(name="sequence_enchere",sequenceName = "seq_id_enchere",allocationSize = 1)
	@Id
	private int id;
	
	@Column(name="idvente")
	private int idvente;
	
	@Column(name="idutilisateur")
	private int idutilisateur;
	
	@Column(name="daty")
	private LocalDate daty;
	
	@Column(name="montant")
	private double montant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdvente() {
		return idvente;
	}

	public void setIdvente(int idvente) {
		this.idvente = idvente;
	}

	public int getIdutilisateur() {
		return idutilisateur;
	}

	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}

	public LocalDate getDaty() {
		return daty;
	}

	public void setDaty(LocalDate daty) {
		this.daty = daty;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	
	
}
