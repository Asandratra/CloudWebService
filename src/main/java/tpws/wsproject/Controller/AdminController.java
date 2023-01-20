package tpws.wsproject.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.Admin;
import tpws.wsproject.Services.AdminService;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService serv;
	
	@PostMapping
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin){
		serv.saveAdmin(admin);
		return ResponseEntity.ok(admin);
	}
	
	@GetMapping
	public Admin findAdmin(@RequestBody Admin admin){
		return serv.findAdmin(admin.getUsername(),admin.getMdp());
	}
}
