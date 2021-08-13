package br.com.stefanini.exercicioTres.persistence;

import java.sql.PreparedStatement;

import br.com.stefanini.exercicioTres.entity.ItemProduto;
import br.com.stefanini.exercicioTres.entity.Produto;

public class ItemProdutoDAO extends DAO implements IItemProdutoDAO {

	@Override
	public String gravarItemProduto(Produto produto, ItemProduto itemProduto) throws Exception {
		open();
		stmt = con.prepareStatement("insert into produto (nomeProduto, valor) values (?,?)");
		stmt.setString(1, produto.getNomeProduto());
		stmt.setDouble(2, produto.getValor());
		stmt.executeUpdate();
		stmt.close();
		
		stmt = con.prepareStatement("insert into itemProduto (quantidade, valorFinal, idProduto) values (?,?,?)");
		stmt.setDouble(1, itemProduto.getQuantidade());
		stmt.setDouble(2, (itemProduto.getQuantidade() * produto.getValor()));
		stmt.setInt(3, produto.getIdProduto());
		stmt.executeUpdate();
		
		
		close();
		return "Produto e item produto gravados com sucesso!";
	}
	
	
	public static void main(String[] args) {
		ItemProdutoDAO itemProdutoDAO = new ItemProdutoDAO();
		Produto produto = new Produto( 1, "camisa", 20.);
		ItemProduto itemProduto = new ItemProduto(5, produto);
		
		try {
			itemProdutoDAO.gravarItemProduto(produto, itemProduto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
