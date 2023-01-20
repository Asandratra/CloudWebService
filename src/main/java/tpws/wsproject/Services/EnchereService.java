package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpws.wsproject.Entities.Enchere;
import tpws.wsproject.Repositories.EnchereRepository;

@Service
public class EnchereService {

	
	@Autowired
	private EnchereRepository repo;
	
	public void saveenchere(int iduser,Enchere e) throws Exception {
		
	double montant = repo.getMontantByIdUtilisateur(iduser);
	double max = this.getMaxByidvente(e.getIdvente());
	if(montant>=e.getMontant()) {
	
		if(max<e.getMontant()) {
			e.setIdutilisateur(iduser);
			repo.save(e);
		}else {
			throw new Exception("Exception: veuillez entrez un montant superieur au dernier");
		}
	}else {
		throw new Exception("Exception: votre compte est inferieur a cette montant");
	}
	
	}
	
	public List<Enchere> listEnchere(){
		return repo.findAll();
	}
	
	
	
	public double getMaxByidvente(int idvente) {
		return repo.getMaxByIdVente(idvente);
	}
	
}
