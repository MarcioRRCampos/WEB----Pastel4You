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
@Table(name = "TBL_INGREDIENTES")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ingrediente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1307138520827559072L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID_INGREDIENTE")
	private long id;
	@Column(name = "NM_INGREDIENTE")
	private String ingrediente;
	@Column(name = "TX_PORCAO")
	private Double txPorcao;
	@Column(name = "URL_IMG")
	private String urlImg;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ID_TIPO")
	private TipoDeIngrediente tipo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	public Double getTxPorcao() {
		return txPorcao;
	}
	public void setTxPorcao(Double txPorcao) {
		this.txPorcao = txPorcao;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public TipoDeIngrediente getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeIngrediente tipo) {
		this.tipo = tipo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((ingrediente == null) ? 0 : ingrediente.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((txPorcao == null) ? 0 : txPorcao.hashCode());
		result = prime * result + ((urlImg == null) ? 0 : urlImg.hashCode());
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
		Ingrediente other = (Ingrediente) obj;
		if (id != other.id)
			return false;
		if (ingrediente == null) {
			if (other.ingrediente != null)
				return false;
		} else if (!ingrediente.equals(other.ingrediente))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (txPorcao == null) {
			if (other.txPorcao != null)
				return false;
		} else if (!txPorcao.equals(other.txPorcao))
			return false;
		if (urlImg == null) {
			if (other.urlImg != null)
				return false;
		} else if (!urlImg.equals(other.urlImg))
			return false;
		return true;
	}
	
}
