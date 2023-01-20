package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpws.wsproject.Entities.Vente;
import tpws.wsproject.Repositories.VenteRepository;

@Service
public class VenteService {

	@Autowired
	private VenteRepository repo;
	
	public void saveVente(int iduser,Vente vente) {
		vente.setIdutilisateur(iduser);
		repo.save(vente);
	}
	
	public List<Vente> getAll(){
		return repo.findAll();
	}
	
	public List<Vente> findVenteByDesignation(String des) {
		
		return repo.findByDesignation(des);
	}
	
	
public List<Vente> findVenteByIduser(int iduser) {
		
		return repo.findByIdUtilisateur(iduser);
	}
	
}
