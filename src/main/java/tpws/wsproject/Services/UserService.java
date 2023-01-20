package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tpws.wsproject.Entities.Utilisateur;
import tpws.wsproject.Repositories.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userrepo;
	
	public List<Utilisateur> listAll() {
        return userrepo.findAll();
    }

    public void save(Utilisateur user) {
    	userrepo.save(user);
    }
    
    

    public Utilisateur get(int id) {
        return userrepo.findById(id).get();
    }

    public void delete(int id) {
    	userrepo.deleteById(id);
    }
	
    
    public Utilisateur findByUsernameAndMdp(String username,String mdp) {
    	
    	return userrepo.findByUsernameAndMdp(username, mdp);
    	
    }
   
}
