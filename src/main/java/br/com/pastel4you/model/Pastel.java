package br.com.pastel4you.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@Entity
@Table(name = "TBL_PASTEL")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pastel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1377910860657213186L;

	private long id;
	private String nomePastel;
	private String valorPastel;
	private String urlImg;
	//@OneToMany
	//@JoinTable(name="TBL_INGREDIENTE_X_PASTEL"), @JoinColumn ( name= "ID_IGREDIENTE_PASTEL" )
	//@JoinColumn(name="ID_IGREDIENTE_PASTEL")
	//@ManyToMany(cascade=CascadeType.ALL)  
    //@JoinTable(name="TBL_INGREDIENTES", joinColumns=@JoinColumn(name="ID_PASTEL"), inverseJoinColumns=@JoinColumn(name="ID_PASTEL"))  
	private Set<Ingrediente> ingredientes;
	
	public Pastel(long id, String nomePastel, String valorPastel, String urlImg, Set<Ingrediente> ingredientes) {
		super();
		this.id = id;
		this.nomePastel = nomePastel;
		this.valorPastel = valorPastel;
		this.urlImg = urlImg;
		this.ingredientes = ingredientes;
	}
	@Id
	@GeneratedValue
	@Column(name = "ID_PASTEL")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "NM_PASTEL")
	public String getNomePastel() {
		return nomePastel;
	}
	public void setNomePastel(String nomePastel) {
		this.nomePastel = nomePastel;
	}

	@Column(name = "VALOR_PASTEL")
	public String getValorPastel() {
		return valorPastel;
	}
	public void setValorPastel(String valorPastel) {
		this.valorPastel = valorPastel;
	}

	@Column(name = "URL_IMG_PASTEL")
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	//@ManyToMany(cascade=CascadeType.ALL)  
    //@JoinTable(name="ID_IGREDIENTE_PASTEL", joinColumns=@JoinColumn(name="ID_PASTEL"), inverseJoinColumns=@JoinColumn(name="ID_PASTEL"))
	
	//@OneToMany(cascade=CascadeType.ALL, mappedBy = "ID_INGREDIENTE")
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="TBL_INGREDIENTE_X_PASTEL", joinColumns={@JoinColumn(name="ID_PASTEL")}, inverseJoinColumns={@JoinColumn(name="ID_PASTEL")})
	public Set<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(Set<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		result = prime * result + ((nomePastel == null) ? 0 : nomePastel.hashCode());
		result = prime * result + ((urlImg == null) ? 0 : urlImg.hashCode());
		result = prime * result + ((valorPastel == null) ? 0 : valorPastel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pastel other = (Pastel) obj;
		if (id != other.id)
			return false;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		if (nomePastel == null) {
			if (other.nomePastel != null)
				return false;
		} else if (!nomePastel.equals(other.nomePastel))
			return false;
		if (urlImg == null) {
			if (other.urlImg != null)
				return false;
		} else if (!urlImg.equals(other.urlImg))
			return false;
		if (valorPastel == null) {
			if (other.valorPastel != null)
				return false;
		} else if (!valorPastel.equals(other.valorPastel))
			return false;
		return true;
	}
	
	
	
}
