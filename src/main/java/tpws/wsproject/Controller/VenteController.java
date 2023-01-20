package tpws.wsproject.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.Vente;
import tpws.wsproject.Services.VenteService;

@CrossOrigin
@RestController
@RequestMapping("/vente")
public class VenteController {

	
	@Autowired
	private VenteService serv;
	
	@PostMapping("{idutilisateur}")
	public void save(@PathVariable int idutilisateur,@RequestBody Vente vente){
		serv.saveVente(idutilisateur,vente);
		
	}
	@GetMapping
	public Map<String,Object> getAll(){
		Map<String, Object> data = new HashMap<String, Object>();
		List<Vente> list = serv.getAll();
		;
		data.put("data", list);
		
		return data;
	}
	
	@GetMapping("/findByDesignation/{des}")
	public Map<String, Object> findVenteByDesignation(@PathVariable String des){
		
		Map<String, Object> data = new HashMap<String, Object>();
		List<Vente> list = serv.findVenteByDesignation(des);  
		data.put("listVente", list);
		
		return data;
		
	}
	
	@GetMapping("/findById/{idutilisateur}")
	public Map<String, Object> findVenteByid(@PathVariable int idutilisateur){
		
		Map<String, Object> data = new HashMap<String, Object>();
		List<Vente> list = serv.findVenteByIduser(idutilisateur);  
		data.put("listVente", list);
		
		return data;
		
	}
}
