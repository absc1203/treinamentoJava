package br.com.stefanini.projetoDois.model;

public class ItemProduto implements Comparable<ItemProduto> {

	private Integer idItem;
	private Integer quantidade;
	private Double valorFinal;
	private Produto produto;

	public ItemProduto() {
	}

	public ItemProduto(Integer idItem, Produto produto, Integer quantidade) {
		super();
		this.idItem = idItem;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ItemProduto [idItem=" + idItem + ", quantidade=" + quantidade + ", valorFinal=" + valorFinal
				+ ", produto=" + produto + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		ItemProduto item = (ItemProduto) o;
		return (this.idItem.equals(item.getIdItem()));
	}
	
	@Override
	public int compareTo(ItemProduto o) {
		return idItem.compareTo(o.getIdItem());
	}
	

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
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
	
	public static void main(String[] args) {
		ItemProduto item1 = new ItemProduto(10, new Produto(100, "camisa", 100., "http://imagem.jpg"), 3);
		ItemProduto item2 = new ItemProduto(11, new Produto(80, "calca", 90., "http://imagem.jpg"), 5);
		
		System.out.println(item1.equals(item2));
	}

	

}
