package br.com.stefanini.projetoDois.controller;

import br.com.stefanini.projetoDois.model.ItemProduto;

public class ControllerCalculoProduto {

	public void gerarPrecoItemProduto(ItemProduto item) throws Exception {
		if (item == null) {
			throw new Exception("Item deve possuir instancia");
		}
		item.setValorFinal(item.getProduto().getValor() * item.getQuantidade());

	}

}
