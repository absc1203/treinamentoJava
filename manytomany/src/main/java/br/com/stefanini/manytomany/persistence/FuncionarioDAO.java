package br.com.stefanini.manytomany.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.manytomany.entity.Funcionario;

public class FuncionarioDAO extends DAO {
	
	public List<Funcionario> findAllFuncionario() throws Exception{
		
		open();
		stmt = con.prepareStatement("select idFuncionario, nomeFuncionario from funcionario");
		rs = stmt.executeQuery();
		List<Funcionario> lista = new ArrayList<>();
		while(rs.next()) {
			Funcionario funcionario = new Funcionario();
			funcionario.setIdFuncionario(rs.getInt(1));
			funcionario.setNomeFuncionario(rs.getString(2));
			lista.add(funcionario);
		}
		
		close();
		return lista;
	}
	
	public Funcionario findById(Integer id) throws Exception {
  	  open();
		  stmt = con.prepareStatement("select  * from funcionario where idFuncionario=?");
		      stmt.setInt(1, id);
		      rs = stmt.executeQuery();
		      Funcionario funcionario = null;
		      if(rs.next()) {
		    	  funcionario = new Funcionario();
		      	            funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
		                    funcionario.setNomeFuncionario(rs.getString("nomeFuncionario")); 
		    }
		  close();
		  return funcionario;
   }
	

}
