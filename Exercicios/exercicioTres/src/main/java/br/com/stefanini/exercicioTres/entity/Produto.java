package br.com.stefanini.exercicioTres.entity;

public class Produto {

	private Integer idProduto;
	private String nomeProduto;
	private Double valor;

	public Produto() {

	}

	public Produto(Integer idProduto, String nomeProduto, Double valor) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}
	
	

	public Produto(String nomeProduto, Double valor) {
		super();
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", valor=" + valor + "]";
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
