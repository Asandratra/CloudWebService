package tpws.wsproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpws.wsproject.Entities.Utilisateur;

public interface UserRepository extends JpaRepository<Utilisateur, Integer>{

	@Query(value="select * from utilisateur u where u.username= :username and u.mdp= :mdp",nativeQuery=true)
	Utilisateur findByUsernameAndMdp(@Param("username")String username,@Param("mdp")String mdp);
	
}
