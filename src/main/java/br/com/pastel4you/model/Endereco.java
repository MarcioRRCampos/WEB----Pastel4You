package br.com.pastel4you.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@Entity
@Table(name = "TBL_ENDERECO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Endereco implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2830144838946254243L;

	@Id
	@GeneratedValue
	@Column(name = "ID_ENDERECO")
	private long id;
	
	@Column(name = "NM_RUA")
	private String rua;
	
	@Column(name = "NM_BAIRRO")
	private String bairro;
	
	@Column(name = "NM_CIDADE")
	private String cidade;
	
	@Column(name = "NUM_CASA")
	private int numero;
	
	@Column(name = "NUM_CEP")
	private String cep;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
//	public Endereco(long id, String rua, String bairro, String cidade, int numero, String cep) {
//		super();
//		this.id = id;
//		this.rua = rua;
//		this.bairro = bairro;
//		this.cidade = cidade;
//		this.numero = numero;
//		this.cep = cep;
//	}
	


}
