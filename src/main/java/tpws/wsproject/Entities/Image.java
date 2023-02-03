package tpws.wsproject.Entities;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Visuel")
public class Image {

	@MongoId
	private int id;
	
	private int idVente;
	
	private String data;
	
	public Image() {}
	
	public Image(int idvente, String data) {
		this.idVente = idvente;
		this.data = data;
	}

	public Image(int id,int idvente, String data) {
		this.id = id;
		this.idVente = idvente;
		this.data = data;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getIdVente() {
		return idVente;
	}

	public void setIdVente(int idvente) {
		this.idVente = idvente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
	
	
}
