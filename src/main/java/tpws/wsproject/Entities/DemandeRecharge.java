package tpws.wsproject.Entities;

import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table(name = "demanderecharge")
public class DemandeRecharge {

	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_iddemanderecharge")
	@SequenceGenerator(name="sequence_iddemanderecharge",sequenceName = "seq_id_demanderecharge",allocationSize = 1)
    @Id
    private int id;

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Date getDaty() {
        return daty;
    }

    public void setDaty(Date daty) {
        this.daty = daty;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    @Column(name = "idutilisateur")
    private int idUtilisateur;

    @Column(name = " daty")
    private Date daty;

    @Column(name = "montant")
    private int montant;

    @Column(name = "statut")
    private int statut;

    public int getId() {
        return id;
    }

}
