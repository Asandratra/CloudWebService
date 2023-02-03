package tpws.wsproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tpws.wsproject.Entities.Admin;
import tpws.wsproject.Repositories.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repo;
	
	public void saveAdmin(Admin admin) {
		
		repo.save(admin);
	}
	
	public Admin findAdmin(String username,String mdp) {
	
		return repo.findByUsernameAndMdp(username,mdp);
	}
	
}
