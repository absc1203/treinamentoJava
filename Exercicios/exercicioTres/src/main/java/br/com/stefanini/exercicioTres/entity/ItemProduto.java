package br.com.stefanini.exercicioTres.entity;

public class ItemProduto {

	private Integer idItem;
	private Integer quantidade;
	private Double valorFinal;
	private Produto produto;

	public ItemProduto() {

	}

	public ItemProduto(Integer idItem, Integer quantidade, Double valorFinal, Produto produto) {
		super();
		this.idItem = idItem;
		this.quantidade = quantidade;
		this.valorFinal = valorFinal;
		this.produto = produto;
	}
	
	

	public ItemProduto(Integer idItem, Integer quantidade, Produto produto) {
		super();
		this.idItem = idItem;
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	

	public ItemProduto(Integer quantidade, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "ItemProduto [idItem=" + idItem + ", quantidade=" + quantidade + ", valorFinal=" + valorFinal
				+ ", produto=" + produto + "]";
	}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	public void gerarPrecoItemProduto(ItemProduto item) throws Exception {
		if (item == null) {
			throw new Exception("Item deve possuir instancia");
		}
		item.setValorFinal(item.getProduto().getValor() * item.getQuantidade());

	}

}
