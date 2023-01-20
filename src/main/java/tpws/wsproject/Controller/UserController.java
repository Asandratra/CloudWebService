package tpws.wsproject.Controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.Utilisateur;
import tpws.wsproject.Services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/utilisateur")
public class UserController {

	
	@Autowired
    private UserService service;

    @GetMapping
    public Map<String, Object> getAll(){
    	Map<String, Object> data = new HashMap<String, Object>();
    	
    	List<Utilisateur> list = service.listAll();
    	data.put("data", list);
    	return data;
    }

    @PostMapping
    public ResponseEntity<Utilisateur> saveUser(@RequestBody Utilisateur user) {
        service.save(user);
        return ResponseEntity.ok(user);
    }

    @PutMapping("{Id}")
    public ResponseEntity<Utilisateur> UpdateUser(@PathVariable int Id,@RequestBody Utilisateur usermodified) {
    	Utilisateur user = service.get(Id);
    	user.setUsername(usermodified.getUsername());
    	
		service.get(Id);
		return ResponseEntity.ok(user);
	}

    @DeleteMapping("{Id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable int Id) {
        service.delete(Id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping("/find")
    public Utilisateur findUser(@RequestBody Utilisateur user) {
    	
    	return service.findByUsernameAndMdp(user.getUsername(), user.getMdp());
    	
    }
   
}
