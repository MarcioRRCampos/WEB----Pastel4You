package br.com.pastel4you.model;

import java.io.Serializable;

public class ItemDeVenda implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7660539148862275956L;
	private Venda venda;
	private Pastel pastel;
	private Estoque produtoEstoque;
	private String valorVenda;
	public ItemDeVenda(Venda venda, Pastel pastel, Estoque produtoEstoque, String valorVenda) {
		super();
		this.venda = venda;
		this.pastel = pastel;
		this.produtoEstoque = produtoEstoque;
		this.valorVenda = valorVenda;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Pastel getPastel() {
		return pastel;
	}
	public void setPastel(Pastel pastel) {
		this.pastel = pastel;
	}
	public Estoque getProdutoEstoque() {
		return produtoEstoque;
	}
	public void setProdutoEstoque(Estoque produtoEstoque) {
		this.produtoEstoque = produtoEstoque;
	}
	public String getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pastel == null) ? 0 : pastel.hashCode());
		result = prime * result + ((produtoEstoque == null) ? 0 : produtoEstoque.hashCode());
		result = prime * result + ((valorVenda == null) ? 0 : valorVenda.hashCode());
		result = prime * result + ((venda == null) ? 0 : venda.hashCode());
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
		ItemDeVenda other = (ItemDeVenda) obj;
		if (pastel == null) {
			if (other.pastel != null)
				return false;
		} else if (!pastel.equals(other.pastel))
			return false;
		if (produtoEstoque == null) {
			if (other.produtoEstoque != null)
				return false;
		} else if (!produtoEstoque.equals(other.produtoEstoque))
			return false;
		if (valorVenda == null) {
			if (other.valorVenda != null)
				return false;
		} else if (!valorVenda.equals(other.valorVenda))
			return false;
		if (venda == null) {
			if (other.venda != null)
				return false;
		} else if (!venda.equals(other.venda))
			return false;
		return true;
	}
	
	
}