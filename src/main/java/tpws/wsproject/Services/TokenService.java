package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpws.wsproject.Entities.Token;
import tpws.wsproject.Repositories.TokenRepository;

@Service
public class TokenService {
	
	@Autowired
	private TokenRepository repo;

	
	public List<Token> listAll() {
        return repo.findAll();
    }

    public void save(Token token) {
    	repo.save(token);
    }
    
    

    public Token get(int id) {
        return repo.findById(id).get();
    }

    public void delete(int id) {
    	repo.deleteById(id);
    }
	
    
	
}
