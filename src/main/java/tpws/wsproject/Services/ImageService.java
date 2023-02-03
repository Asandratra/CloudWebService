package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpws.wsproject.Entities.Image;
import tpws.wsproject.Repositories.ImageRepository;

@Service
public class ImageService {

	@Autowired
	private ImageRepository repo;
	
	public Image getImageById(int id) {
		
		return repo.findById(id).get();
	}
	
	public List<Image> getAllByIdVente(int idvente){
		return repo.findAllByIdVente(idvente);
	}
	
	public void InsertImage(Image im) {
		
		repo.save(im);
	}
}
