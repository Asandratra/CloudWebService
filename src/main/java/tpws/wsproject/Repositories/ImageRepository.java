package tpws.wsproject.Repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpws.wsproject.Entities.*;

public interface ImageRepository extends org.springframework.data.mongodb.repository.MongoRepository<Image, Integer>{

	@Query(value="select * from image i where i.idvente= :id",nativeQuery=true)
	List<Image> findAllByIdVente(@Param("id")int id);
	
}

