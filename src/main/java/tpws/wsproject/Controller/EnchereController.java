package tpws.wsproject.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.Enchere;
import tpws.wsproject.Services.EnchereService;

@CrossOrigin
@RestController
@RequestMapping("/enchere")
public class EnchereController {

	
	@Autowired
	private EnchereService serv;
	
	@PostMapping("{idutilisateur}")
	public void saveEnchere(@PathVariable int idutilisateur,@RequestBody Enchere e) throws Exception {
		serv.saveenchere(idutilisateur,e);
	}
	
	@GetMapping
	public Map<String, Object> listEnchere(){
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<Enchere> list = serv.listEnchere();
		data.put("listEnchere", list);
		
		return data;
	}
	
	@GetMapping("/getMax/{idvente}")
	public double getMaxbyidvente(@PathVariable int idvente) {
		double max = serv.getMaxByidvente(idvente);
		
		return max;
	}
}
