package br.com.stefanini.exercicioTres.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.exercicioTres.entity.ItemProduto;
import br.com.stefanini.exercicioTres.entity.Produto;

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
	
	
	public void gerarPrecoItemProduto(ItemProduto item) throws Exception {
		if (item == null) {
			throw new Exception("Item deve possuir instancia");
		}
		item.setValorFinal(item.getProduto().getValor() * item.getQuantidade());

	}
	

}
