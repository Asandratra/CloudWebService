package tpws.wsproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpws.wsproject.Entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Integer>{

	@Query(value="select montant from compte c where c.idutilisateur= :iduser",nativeQuery=true)
	double getMontantById(@Param("iduser")int iduser);
	
	@Query(value="select * from compte c where c.idutilisateur= :iduser",nativeQuery=true)
	Compte findCompteByIdUtilisateur(@Param("iduser")int iduser);
	
}
