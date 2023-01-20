package tpws.wsproject.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpws.wsproject.Entities.Vente;

public interface VenteRepository extends JpaRepository<Vente, Integer>{

	
	@Query(value="select * from vente v where lower(v.designation) LIKE %:designation%",nativeQuery=true)
	List<Vente> findByDesignation(@Param("designation")String designation);
	
	@Query(value="select * from vente v where v.idutilisateur= :idutilisateur",nativeQuery=true)
	List<Vente> findByIdUtilisateur(@Param("idutilisateur")int idutilisateur);
}
