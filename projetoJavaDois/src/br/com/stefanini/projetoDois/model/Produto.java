package br.com.stefanini.projetoDois.model;

public class Produto {

	private Integer idProduto;
	private String nome;
	private Double valor;
	private String linkImagem;

	public Produto() {
	}

	public Produto(Integer idProduto, String nome, Double valor, String linkImagem) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.valor = valor;
		this.linkImagem = linkImagem;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", valor=" + valor + ", linkImagem=" + linkImagem
				+ "]";
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getLinkImagem() {
		return linkImagem;
	}

	public void setLinkImagem(String linkImagem) {
		this.linkImagem = linkImagem;
	}

}
