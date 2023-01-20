package tpws.wsproject.Entities;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "token")
public class Token {

	@Id
    private int Id;
	
	@Column(name="idutilisateur")
	private int idVehicule;
	
	@Column(name="date_expiration")
	private LocalDate dt_expiration;
    
}
