package br.com.pastel4you.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "TBL_CLIENTE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 769170762041965189L;

	@Id
	@GeneratedValue  
	@Column(name = "ID_CLIENTE")
	private long id;
	
	@Column(name = "NM_NOME")
	private String nome;
	
	@Column(name = "TEL_FONE")
	private String telFixo;
	
	@Column(name = "TEL_CELULAR")
	private String telCleular;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ID_ENDERECO")
	private Endereco endereco;
	
	@Column(name = "ID_REDES_SOCOCIAS")
	private String redeSocial;
	
	public Cliente(long id, String nome, String telFixo, String telCleular, Endereco endereco, String redeSocial) {
		super();
		this.id = id;
		this.nome = nome;
		this.telFixo = telFixo;
		this.telCleular = telCleular;
		this.endereco = endereco;
		this.redeSocial = redeSocial;
	}
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
	public String getTelFixo() {
		return telFixo;
	}
	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}
	public String getTelCleular() {
		return telCleular;
	}
	public void setTelCleular(String telCleular) {
		this.telCleular = telCleular;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getRedeSocial() {
		return redeSocial;
	}
	public void setRedeSocial(String redeSocial) {
		this.redeSocial = redeSocial;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((redeSocial == null) ? 0 : redeSocial.hashCode());
		result = prime * result + ((telCleular == null) ? 0 : telCleular.hashCode());
		result = prime * result + ((telFixo == null) ? 0 : telFixo.hashCode());
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
		Cliente other = (Cliente) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (redeSocial == null) {
			if (other.redeSocial != null)
				return false;
		} else if (!redeSocial.equals(other.redeSocial))
			return false;
		if (telCleular == null) {
			if (other.telCleular != null)
				return false;
		} else if (!telCleular.equals(other.telCleular))
			return false;
		if (telFixo == null) {
			if (other.telFixo != null)
				return false;
		} else if (!telFixo.equals(other.telFixo))
			return false;
		return true;
	}
}
