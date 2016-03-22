package br.com.pastel4you.model;

import java.io.Serializable;

import javax.swing.text.DateFormatter;

public class Venda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -662942925779626804L;
	private long id; 
	private long idCliente;
	private DateFormatter dateCompra;
	private String valorVendaPastel;
	public Venda(long id, long idCliente, DateFormatter dateCompra, String valorVendaPastel) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.dateCompra = dateCompra;
		this.valorVendaPastel = valorVendaPastel;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public DateFormatter getDateCompra() {
		return dateCompra;
	}
	public void setDateCompra(DateFormatter dateCompra) {
		this.dateCompra = dateCompra;
	}
	public String getValorVendaPastel() {
		return valorVendaPastel;
	}
	public void setValorVendaPastel(String valorVendaPastel) {
		this.valorVendaPastel = valorVendaPastel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateCompra == null) ? 0 : dateCompra.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (idCliente ^ (idCliente >>> 32));
		result = prime * result + ((valorVendaPastel == null) ? 0 : valorVendaPastel.hashCode());
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
		Venda other = (Venda) obj;
		if (dateCompra == null) {
			if (other.dateCompra != null)
				return false;
		} else if (!dateCompra.equals(other.dateCompra))
			return false;
		if (id != other.id)
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (valorVendaPastel == null) {
			if (other.valorVendaPastel != null)
				return false;
		} else if (!valorVendaPastel.equals(other.valorVendaPastel))
			return false;
		return true;
	}

	
}