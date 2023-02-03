package tpws.wsproject.Controller;

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

import tpws.wsproject.Entities.DemandeRecharge;
import tpws.wsproject.Services.DemandeRechargeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/demanderecharge")
public class DemandeRechargeController {

    @Autowired
    private DemandeRechargeService service;

    @GetMapping
    public Map<String, Object> ListeDemandeRecharge() {
        Map<String, Object> data = new HashMap<String, Object>();
        List<DemandeRecharge> listdemanderecharge = service.listAll();
        data.put("data", listdemanderecharge);
        return data;
    }

    @PostMapping("/{idutilisateur}")
    public DemandeRecharge saveDemandeRecharge(@PathVariable("idutilisateur") int idutilisateur,@RequestBody DemandeRecharge demanderecharge) {
        service.save(idutilisateur,demanderecharge);
        return demanderecharge;
    }

    @PutMapping("/{Id}")
    public ResponseEntity<DemandeRecharge> UpdateDemandeRecharge(@PathVariable("Id") int Id,
            @RequestBody DemandeRecharge av) {
        DemandeRecharge demanderecharge = service.get(Id);
        demanderecharge.setIdUtilisateur(av.getIdUtilisateur());
        demanderecharge.setDaty(av.getDaty());
        demanderecharge.setId(Id);
        demanderecharge.setMontant(av.getMontant());
        demanderecharge.setStatut(av.getStatut());
        service.save(demanderecharge.getIdUtilisateur(),demanderecharge);
        return ResponseEntity.ok(demanderecharge);
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<DemandeRecharge> deleteDemandeRecharge(@PathVariable("Id") int Id) {
        service.delete(Id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{Id}")
    public DemandeRecharge findDemandeRecharge(@PathVariable("Id") int Id) {
        DemandeRecharge avi = service.get(Id);

        return avi;
    }
}
