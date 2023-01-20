package tpws.wsproject.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpws.wsproject.Entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	@Query(value="select * from admin a where a.username= :username and a.mdp= :mdp",nativeQuery=true)
	Admin findByUsernameAndMdp(@Param("username")String username,@Param("mdp")String mdp);
	
}
