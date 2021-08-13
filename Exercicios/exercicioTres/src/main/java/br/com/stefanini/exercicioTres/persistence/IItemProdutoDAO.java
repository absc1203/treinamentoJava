package br.com.stefanini.exercicioTres.persistence;

import br.com.stefanini.exercicioTres.entity.ItemProduto;
import br.com.stefanini.exercicioTres.entity.Produto;

public interface IItemProdutoDAO {
	
	public String gravarItemProduto(Produto produto, ItemProduto itemProduto) throws Exception;

}
