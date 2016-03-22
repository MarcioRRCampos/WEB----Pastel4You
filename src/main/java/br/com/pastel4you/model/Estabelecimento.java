package br.com.pastel4you.model;

import java.io.Serializable;

public class Estabelecimento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8593581497370782933L;
	
	private long id;
	private String estabelecimento;
	
	public Estabelecimento(long id, String estabelecimento) {
		super();
		this.id = id;
		this.estabelecimento = estabelecimento;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estabelecimento == null) ? 0 : estabelecimento.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Estabelecimento other = (Estabelecimento) obj;
		if (estabelecimento == null) {
			if (other.estabelecimento != null)
				return false;
		} else if (!estabelecimento.equals(other.estabelecimento))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}