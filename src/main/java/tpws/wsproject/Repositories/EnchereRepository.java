package tpws.wsproject.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpws.wsproject.Entities.Enchere;


public interface EnchereRepository extends JpaRepository<Enchere, Integer>{

	
	@Query(value="Select max(montant) from enchere e where e.idvente= :idvente",nativeQuery=true)
	double getMaxByIdVente(@Param("idvente")int idvente);
	
	@Query(value="Select montant from compte c where c.idutilisateur= :idutilisateur",nativeQuery=true)
	double getMontantByIdUtilisateur(@Param("idutilisateur")int idutilisateur);
	
	
}
