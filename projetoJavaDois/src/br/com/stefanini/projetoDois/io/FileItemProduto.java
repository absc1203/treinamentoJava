package br.com.stefanini.projetoDois.io;

import java.io.FileWriter;
import java.util.List;

import br.com.stefanini.projetoDois.model.ItemProduto;

public class FileItemProduto implements IFileItemProduto{
	
	FileWriter writer;

	@Override
	public void open() throws Exception {
		writer = new FileWriter("c:/temp/item.csv", true);
		
	}

	@Override
	public void write(List<ItemProduto> items) throws Exception {
		for(ItemProduto item : items) {
			writer.write(item.getIdItem() + "," + item.getProduto().getNome()+","
					+ item.getProduto().getIdProduto()+","+ item.getProduto().getValor()+","+item.getValorFinal()+";\n");
		}
		
	}

	@Override
	public void close() throws Exception {
		writer.close();
		
	}
	
	

}
