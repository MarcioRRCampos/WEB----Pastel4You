package br.com.pastel4you.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="STUDENT")
@NamedNativeQuery(       
    name = "call_GetStudentDetails_procedure",
    query = "CALL getStudentDetails()",
    resultClass = Pastel.class
    )

public class Pastel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1377910860657213186L;
	private static final CascadeType[] ALL = null;
	@Id
	@GeneratedValue
	@Column(name = "ID_PASTEL")
	private long id;
	@Column(name = "NM_PASTEL")
	private String nomePastel;
	@Column(name = "VALOR_PASTEL")
	private String valorPastel;
	@Column(name = "URL_IMG_PASTEL")
	private String urlImg;

    @OneToMany(targetEntity=br.com.pastel4you.model.Ingrediente.class,mappedBy="ID_INGREDIENTE")
	//@OneToMany(cascade = CascadeType.ALL)
	private ArrayList<Ingrediente> ingredientes;
	
	public Pastel(long id, String nomePastel, String valorPastel, String urlImg,
			ArrayList<Ingrediente> ingredientes) {
		super();
		this.id = id;
		this.nomePastel = nomePastel;
		this.valorPastel = valorPastel;
		this.urlImg = urlImg;
		this.ingredientes = ingredientes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomePastel() {
		return nomePastel;
	}
	public void setNomePastel(String nomePastel) {
		this.nomePastel = nomePastel;
	}
	public String getValorPastel() {
		return valorPastel;
	}
	public void setValorPastel(String valorPastel) {
		this.valorPastel = valorPastel;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
