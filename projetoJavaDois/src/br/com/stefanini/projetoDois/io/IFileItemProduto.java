package br.com.stefanini.projetoDois.io;

import java.util.List;

import br.com.stefanini.projetoDois.model.ItemProduto;

public interface IFileItemProduto {

	public void open() throws Exception;

	public void write(List<ItemProduto> items) throws Exception;

	public void close() throws Exception;

}
