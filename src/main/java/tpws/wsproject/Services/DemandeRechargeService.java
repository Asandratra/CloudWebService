package tpws.wsproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tpws.wsproject.Entities.DemandeRecharge;
import tpws.wsproject.Repositories.DemandeRechargeRepository;
import java.util.List;
import java.sql.Date;

@Service
public class DemandeRechargeService {
    @Autowired
    private DemandeRechargeRepository repo;

    public List<DemandeRecharge> listAll() {
        return repo.findAll();
    }

    public void save(int id,DemandeRecharge demanderecharge) {
    	demanderecharge.setIdUtilisateur(id);
        demanderecharge.setDaty(new Date(System.currentTimeMillis()));
        repo.save(demanderecharge);
    }

    public DemandeRecharge get(int id) {
        return repo.findById(id).get();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
