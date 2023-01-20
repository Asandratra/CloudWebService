package tpws.wsproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tpws.wsproject.Entities.Compte;
import tpws.wsproject.Repositories.CompteRepository;

@Service
public class CompteService {

	@Autowired
	private CompteRepository repo;
	
	public double getMontant(int id) {
		if(repo.getMontantById(id)!=0) {
			return repo.getMontantById(id);
		}else {
			return 0;
		}
	}
	
	public Compte getCompte(int id) {
		
		return repo.findCompteByIdUtilisateur(id);
		
	}
	
}
