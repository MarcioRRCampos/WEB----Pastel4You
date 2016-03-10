package br.com.pastel4you.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "TBL_CLIENTE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID_CLIENTE")
	private long id;

	@Column(name = "NM_NOME")
	private String firstName;

	@Column(name = "TEL_FONE")
	private String lastName;

	@Column(name = "TEL_CELULAR")
	private String email;

	@Column(name = "ID_ENDERECO")
	private Integer phone;
	
	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Column(name = "ID_REDES_SOCOCIAS")
	private String idRedesSocias;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getIdRedesSocias() {
		return idRedesSocias;
	}

	public void setIdRedesSocias(String idRedesSocias) {
		this.idRedesSocias = idRedesSocias;
	}
	
	
}
