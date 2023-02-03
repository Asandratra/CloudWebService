package tpws.wsproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.Compte;
import tpws.wsproject.Services.CompteService;

@CrossOrigin
@RestController
@RequestMapping("/compte")
public class CompteController {

	
	@Autowired
	private CompteService serv;
	
	@GetMapping("/{idutilisateur}")
	public double getMontant(@PathVariable int idutilisateur) {
		
		return serv.getMontant(idutilisateur);
		
	}
	
	@GetMapping("/find/{idutilisateur}")
	public Compte getCompteByUser(@PathVariable int idutilisateur) {
		
	Compte c = serv.getCompte(idutilisateur);
	return c;
		
	}
	
}
