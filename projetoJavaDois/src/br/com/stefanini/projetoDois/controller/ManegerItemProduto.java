package br.com.stefanini.projetoDois.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.projetoDois.model.ItemProduto;
import br.com.stefanini.projetoDois.model.Produto;

public class ManegerItemProduto {
	
	private List<ItemProduto> items;
	
	public ManegerItemProduto() {
		this.items = new ArrayList<ItemProduto>();
	}

	public List<ItemProduto> getItems() {
		return items;
	}

	public void setItems(List<ItemProduto> items) {
		this.items = items;
	}
	
	public void mock() throws Exception {
		Produto p1 = new Produto(100, "camisa", 100., "http://imagem.jpg");
		Produto p2 = new Produto(80, "calca", 90., "http://imagem.jpg");
		ItemProduto item1 = new ItemProduto(10, p1, 3);
		ItemProduto item2 = new ItemProduto(11, p2, 5);
		ControllerCalculoProduto calc1 = new ControllerCalculoProduto();
		ControllerCalculoProduto calc2 = new ControllerCalculoProduto();
		calc1.gerarPrecoItemProduto(item1);
		calc2.gerarPrecoItemProduto(item2);
		
		System.out.println(item1);
		System.out.println(item2);
	}
	
	public static void main(String[] args) {
		try {
			new ManegerItemProduto().mock();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
