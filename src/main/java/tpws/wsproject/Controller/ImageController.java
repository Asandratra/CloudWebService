package tpws.wsproject.Controller;

import java.io.IOException;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tpws.wsproject.Entities.Image;
import tpws.wsproject.Services.ImageService;

@CrossOrigin("*")
@RestController
@RequestMapping("/image")
public class ImageController {

	@Autowired
	private ImageService serv;
	
	
	
	@PostMapping
    public String addImage(@RequestParam("idVente") int idVente, @RequestParam("data") String data) throws IOException {
        Image last = serv.getLast();
        int nextid = 1;
        if(last!=null){
            nextid = last.getId+1;
        }
		Image image = new Image(nextid,idVente,data);
        serv.InsertImage(image);
        return "Image added successfully";
    }

    @GetMapping("/getall/{id}")
    public Map<String,Object> getAllImage(@PathVariable int id) {
        List<Image> list = serv.getAllByIdVente(id);
        Map<String,Object> data= new HashMap<String,Object>();
        data.put("data",list);
        
        return data;
    }
    
    
    @GetMapping("/find/{id}")
    public Image getImage(@PathVariable int id) {
       Image image = serv.getImageById(id);
        
        
        return image;
    }
    
    
}
