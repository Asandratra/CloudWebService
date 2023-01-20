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
@Table(name="vente")
public class Vente {

	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_vente")
	@SequenceGenerator(name="sequence_vente",sequenceName = "seq_id_vente",allocationSize = 1)
	@Id
	private int id;
	
	@Column(name="idutilisateur")
	private int idutilisateur;
	
	@Column(name="daty")
	private LocalDate daty;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="prixmise")
	private double prixmise;
	
	@Column(name="prixvente")
	private double prixvente;
	
	@Column(name="duree")
	private double duree;
	
	@Column(name="statut")
	private int statut;
	
	@Column(name="idcategorie")
	private int idCategorie;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrixmise() {
		return prixmise;
	}
	public void setPrixmise(double prixmise) {
		this.prixmise = prixmise;
	}
	public double getPrixvente() {
		return prixvente;
	}
	public void setPrixvente(double prixvente) {
		this.prixvente = prixvente;
	}
	public double getDuree() {
		return duree;
	}
	public void setDuree(double duree) {
		this.duree = duree;
	}
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	
	
	
}
