package br.com.pastel4you.model;

import java.io.Serializable;

import javax.swing.text.DateFormatter;

public class Estoque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 882798562650956890L;
	private long idProduto;
	private String valorUnitario;
	private int quantidade;
	private DateFormatter dateCompra;
	private Estabelecimento estabelecimento;
	
	public Estoque(long idProduto, String valorUnitario, int quantidade, DateFormatter dateCompra,
			Estabelecimento estabelecimento) {
		super();
		this.idProduto = idProduto;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
		this.dateCompra = dateCompra;
		this.estabelecimento = estabelecimento;
	}
	
	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(String valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public DateFormatter getDateCompra() {
		return dateCompra;
	}

	public void setDateCompra(DateFormatter dateCompra) {
		this.dateCompra = dateCompra;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateCompra == null) ? 0 : dateCompra.hashCode());
		result = prime * result + ((estabelecimento == null) ? 0 : estabelecimento.hashCode());
		result = prime * result + (int) (idProduto ^ (idProduto >>> 32));
		result = prime * result + quantidade;
		result = prime * result + ((valorUnitario == null) ? 0 : valorUnitario.hashCode());
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
		Estoque other = (Estoque) obj;
		if (dateCompra == null) {
			if (other.dateCompra != null)
				return false;
		} else if (!dateCompra.equals(other.dateCompra))
			return false;
		if (estabelecimento == null) {
			if (other.estabelecimento != null)
				return false;
		} else if (!estabelecimento.equals(other.estabelecimento))
			return false;
		if (idProduto != other.idProduto)
			return false;
		if (quantidade != other.quantidade)
			return false;
		if (valorUnitario == null) {
			if (other.valorUnitario != null)
				return false;
		} else if (!valorUnitario.equals(other.valorUnitario))
			return false;
		return true;
	}

	

}
