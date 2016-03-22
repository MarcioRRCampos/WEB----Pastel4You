package br.com.pastel4you.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "TBL_INGREDIENTE_X_PASTEL")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pastel_Ingrediente implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -8861644294758522528L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID_IGREDIENTE_PASTEL")
	private long id;
	@Column(name = "ID_PASTEL")
	@JoinColumn(name="ID_PASTEL")
	private long pastel;
	@Column(name = "ID_INGREDIENTE")
	@JoinColumn(name="ID_INGREDIENTE")
	private long ingrediente;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPastel() {
		return pastel;
	}
	public void setPastel(long pastel) {
		this.pastel = pastel;
	}
	public long getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(long ingrediente) {
		this.ingrediente = ingrediente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (ingrediente ^ (ingrediente >>> 32));
		result = prime * result + (int) (pastel ^ (pastel >>> 32));
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
		Pastel_Ingrediente other = (Pastel_Ingrediente) obj;
		if (id != other.id)
			return false;
		if (ingrediente != other.ingrediente)
			return false;
		if (pastel != other.pastel)
			return false;
		return true;
	}
	
	
	

}
