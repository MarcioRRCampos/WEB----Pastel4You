package br.com.pastel4you.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@Entity
@Table(name = "TBL_TIPO_INGREDIENTE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoDeIngrediente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8019906087141850696L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID_TIPO_PRODUTO")
	private long id;

	@Column(name = "NM_TIPO")
	private String nome;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		TipoDeIngrediente other = (TipoDeIngrediente) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}	
}
